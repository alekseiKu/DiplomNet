package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitFor;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitUntilPage;

import androidx.test.espresso.NoMatchingViewException;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;

public class AuthorizationSteps {

    private final AuthorizationPage authorizationPage;

    public AuthorizationSteps(AuthorizationPage authorizationPage) {
        this.authorizationPage = authorizationPage;
    }

    public void authorization() {
        try {
            textAuthorization();
        } catch (NoMatchingViewException e) {
            return;
        }
        clickLoginField();
        clickPasswordField();
        clickButton(authorizationPage.getEnterButtonId());
    }

    public void clickLoginField() {
        Allure.step("В поле логин ввести: login2");
        waitUntilPage(authorizationPage.getLoginTextInputLayoutId());
        onView(authorizationPage.getLoginFieldMatcher())
                .perform(replaceText("login2"), closeSoftKeyboard())
                .check(matches(isDisplayed()));
    }

    public void clickButton(int resourceId) {
        Allure.step("Нажать на кнопку");
        waitUntilPage(resourceId);
        onView(withId(resourceId))
                .perform(click());
    }

    public void clickPasswordField() {
        Allure.step("В поле пароль ввести: password2");
        waitUntilPage(authorizationPage.getPasswordTextInputLayoutId());
        onView(authorizationPage.getPasswordFieldMatcher())
                .perform(replaceText("password2"), closeSoftKeyboard())
                .check(matches(isDisplayed()));
    }

    public void clickButtonExit(int resourceId) {
        Allure.step("Нажать на кнопку 'Выход'");
        waitUntilPage(resourceId);
        waitFor(5);
        onView(withId(resourceId))
                .perform(click());
    }

    public void clickLoginFieldWithSpecialCharacters() {
        Allure.step("Ввести в поле Логин спецсимволы");
        onView(authorizationPage.getLoginFieldMatcher())
                .perform(replaceText("$^@#!@"), closeSoftKeyboard());
        onView(allOf(withContentDescription("Неверный логин или пароль"), isDisplayed()));
    }

    public void clickPasswordFieldIsEmpty() {
        Allure.step("Поле Пароль оставить пустым");
        onView(authorizationPage.getPasswordFieldMatcher())
                .perform(replaceText(" "), closeSoftKeyboard())
                .check(matches(isDisplayed()));
        onView(allOf(withContentDescription("Неверный логин или пароль"), isDisplayed()));
    }

    public void clickButtonLogOut() {
        Allure.step("Нажать на кнопку 'Log out'");
        waitUntilPage(authorizationPage.getLogOutTitleId());
        onView(authorizationPage.getLogOutButtonMatcher())
                .perform(click());
    }

    public void textAuthorization() {
        Allure.step("Отобразилась страница Авторизации");
        waitUntilPage(authorizationPage.getNavHostFragmentId());
        waitFor(5);
        onView(authorizationPage.getAuthorizationTextMatcher())
                .check(matches(isDisplayed()));
    }

    public void clickLoginEmpty() {
        Allure.step("Не заполнять поле логин");
        onView(authorizationPage.getLoginFieldMatcher())
                .perform(replaceText("   "), closeSoftKeyboard());
        onView(allOf(withContentDescription("Логин и пароль не могут быть пустыми"), isDisplayed()));
    }

    public void clickLoginFieldUnregisteredUser() {
        Allure.step("Ввести в поле логин выдуманные данные");
        onView(authorizationPage.getLoginFieldMatcher())
                .perform(replaceText("logggggg"), closeSoftKeyboard());
        onView(allOf(withContentDescription("Неверный логин или пароль"), isDisplayed()));
    }

    public void performAuthorizationTest(Runnable loginAction, Runnable passwordAction) {
        textAuthorization();
        loginAction.run();
        passwordAction.run();
        clickButton(authorizationPage.getEnterButtonId());
    }

    public void performAuthorizationTest(Runnable loginAction) {
        performAuthorizationTest(loginAction, this::clickPasswordField);
    }

    public void logout() {
        clickButtonExit(authorizationPage.getAuthorizationImageButtonId());
        clickButtonLogOut();
    }
}
