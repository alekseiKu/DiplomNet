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
import ru.iteco.fmhandroid.ui.pages.AuthorizationPage;
import ru.iteco.fmhandroid.ui.pages.QuotesPage;
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.QuotesSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class QuotesTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    private AuthorizationSteps authorizationSteps;
    private QuotesSteps quotesSteps;

    @Before
    public void setUp() {
        authorizationSteps = new AuthorizationSteps(new AuthorizationPage());
        quotesSteps = new QuotesSteps(new QuotesPage());
        authorizationCheck();
    }

    public void authorizationCheck() {
        authorizationSteps.authorization();
    }

    @AfterClass
    public static void exit() {
        AuthorizationSteps authorizationSteps = new AuthorizationSteps(new AuthorizationPage());
        authorizationSteps.logout();
    }

    @Test
    public void expandThematicQuote() {
        quotesSteps.clickButtonQuote();
        quotesSteps.clickButtonExpandQuote();
        quotesSteps.checkDescriptionQuote();
    }
}
