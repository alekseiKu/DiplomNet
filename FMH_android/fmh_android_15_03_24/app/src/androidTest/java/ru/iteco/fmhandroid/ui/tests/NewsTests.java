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
import ru.iteco.fmhandroid.ui.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.ui.steps.NewsSteps;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class NewsTests {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule = new ActivityScenarioRule<>(AppActivity.class);

    private NewsSteps newsSteps;
    private AuthorizationSteps authorizationSteps;

    @Before
    public void setUp() {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationSteps = new AuthorizationSteps(authorizationPage);
        newsSteps = new NewsSteps();
        authorizationSteps.authorization();
    }

    @AfterClass
    public static void exit() {
        AuthorizationPage authorizationPage = new AuthorizationPage();
        AuthorizationSteps authorizationSteps = new AuthorizationSteps(authorizationPage);
        authorizationSteps.clickButtonExit(authorizationPage.getAuthorizationImageButtonId());
        authorizationSteps.clickButtonLogOut();
    }

    @Test
    public void viewingNewsControlPanel() {
        newsSteps.navigateToNewsControlPanel();
        newsSteps.clickClickNews();
    }

    @Test
    public void creationNewsInControlPanel() {
        newsSteps.navigateToNewsControlPanel();
        newsSteps.fillAndSaveNewsDetails();
    }

    @Test
    public void sortingNewsControlPanel() {
        newsSteps.navigateToNewsControlPanel();
        newsSteps.clickButtonSorting();
    }

    @Test
    public void editNewsControlPanel() {
        newsSteps.navigateToNewsControlPanel();
        newsSteps.clickClickNews();
        newsSteps.editAndSaveNews();
    }

    @Test
    public void deletingActiveNews() {
        newsSteps.navigateToNewsControlPanel();
        newsSteps.clickClickNews();
        newsSteps.clickButtonDeleteNews();
        newsSteps.clickOkDeleteNews();
    }

    @Test
    public void statusChangeNews() {
        newsSteps.navigateToNewsControlPanel();
        newsSteps.clickClickNews();
        newsSteps.clickButtonEditNews();
        newsSteps.clickButtonSwitcher();
        newsSteps.clickButtonSaveEditingNews();
    }

    @Test
    public void filterNewsByCriterionActive() {
        newsSteps.navigateToNewsControlPanel();
        newsSteps.clickFilterNewsControlPanel();
        newsSteps.clickRemoveCheckBoxActive();
        newsSteps.clickButtonFilterNewsControlPanel();
    }
}
