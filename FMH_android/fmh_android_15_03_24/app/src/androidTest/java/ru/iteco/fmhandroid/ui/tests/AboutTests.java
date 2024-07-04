package ru.iteco.fmhandroid.ui.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.pages.AboutPage;
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;
import ru.iteco.fmhandroid.ui.steps.AboutSteps;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.NewsSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class AboutTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    private AboutSteps aboutSteps;

    @Before
    public void setUp() {
        AboutPage aboutPage = new AboutPage();
        NewsSteps newsSteps = new NewsSteps();
        aboutSteps = new AboutSteps(aboutPage, newsSteps);
        AuthorizationPage authorizationPage = new AuthorizationPage();
        AuthorizationSteps authorizationSteps = new AuthorizationSteps(authorizationPage);
        authorizationSteps.authorization();
    }

    @AfterClass
    public static void exit() {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        AuthorizationSteps authorizationSteps = new AuthorizationSteps(authorizationPage);
        authorizationSteps.logout();
    }

    @Test
    public void transitionPrivacyPolicy() {
        aboutSteps.performTransitionTest(aboutSteps::clickButtonPrivacyPolicy);
    }

    @Test
    public void transitionTermsOfUse() {
        aboutSteps.performTransitionTest(aboutSteps::clickButtonTermsOfUse);
    }
}
