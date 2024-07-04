package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitUntilPage;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pages.AboutPage;

public class AboutSteps {

    private final AboutPage aboutPage;
    private final NewsSteps newsSteps;

    public AboutSteps(AboutPage aboutPage, NewsSteps newsSteps) {
        this.aboutPage = aboutPage;
        this.newsSteps = newsSteps;
    }

    public void clickButtonAbout() {
        Allure.step("Нажать на кнопку О приложении");
        waitUntilPage(AboutPage.ABOUT_BUTTON_ID);
        onView(aboutPage.getAboutButtonMatcher())
                .perform(click());
    }

    public void clickButtonPrivacyPolicy() {
        Allure.step("Нажать на ссылку Политика конфиденциальности");
        waitUntilPage(AboutPage.PRIVACY_POLICY_BUTTON_ID);
        onView(aboutPage.getPrivacyPolicyButtonMatcher())
                .check(matches(allOf(withText("https://vhospice.org/#/privacy-policy/"), isDisplayed(), isClickable())));
    }

    public void clickButtonTermsOfUse() {
        Allure.step("Нажать на ссылку Пользовательское соглашение");
        waitUntilPage(AboutPage.TERMS_OF_USE_BUTTON_ID);
        onView(aboutPage.getTermsOfUseButtonMatcher())
                .check(matches(allOf(withText("https://vhospice.org/#/terms-of-use"), isDisplayed(), isClickable())));
    }

    public void performTransitionTest(Runnable transitionAction) {
        newsSteps.clickButtonMainMenu();
        clickButtonAbout();
        transitionAction.run();
        pressBack();
    }
}
