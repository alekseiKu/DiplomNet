package ru.iteco.fmhandroid.ui.tests;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class AuthorizationTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    private AuthorizationSteps authorizationSteps;

    @Before
    public void setUp() {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationSteps = new AuthorizationSteps(authorizationPage);
    }

    @Before
    public void authorizationVerification() {
        try {
            authorizationSteps.textAuthorization();
        } catch (NoMatchingViewException e) {
            authorizationSteps.logout();
        }
    }

    @Test
    public void successfulAuthorization() {
        authorizationSteps.performAuthorizationTest(authorizationSteps::clickLoginField);
    }

    @Test
    public void loginFieldUnregisteredUser() {
        authorizationSteps.performAuthorizationTest(authorizationSteps::clickLoginFieldUnregisteredUser);
    }

    @Test
    public void loginFieldIsEmpty() {
        authorizationSteps.performAuthorizationTest(authorizationSteps::clickLoginEmpty);
    }

    @Test
    public void passwordFieldIsEmpty() {
        authorizationSteps.performAuthorizationTest(authorizationSteps::clickLoginField, authorizationSteps::clickPasswordFieldIsEmpty);
    }

    @Test
    public void loginFieldWithSpecialCharacters() {
        authorizationSteps.performAuthorizationTest(authorizationSteps::clickLoginFieldWithSpecialCharacters);
    }
}
