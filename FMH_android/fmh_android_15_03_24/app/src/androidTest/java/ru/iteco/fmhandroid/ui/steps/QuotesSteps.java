package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pages.QuotesPage;
import ru.iteco.fmhandroid.ui.pages.WaitId;

public class QuotesSteps {

    private final QuotesPage quotesPage;

    public QuotesSteps(QuotesPage quotesPage) {
        this.quotesPage = quotesPage;
    }

    public void clickButtonQuote() {
        Allure.step("Нажать на кнопку Тематические цитаты");
        WaitId.waitUntilPage(quotesPage.getQuotesButtonId());
        onView(quotesPage.getQuotesPageButton()).perform(click());
    }

    public void clickButtonExpandQuote() {
        Allure.step("Развернуть тематическую цитату");
        WaitId.waitUntilPage(quotesPage.getExpandButtonId());
        onView(quotesPage.getQuotesPageButtonExpand()).perform(click());
    }

    public void checkDescriptionQuote() {
        Allure.step("Проверить наличие содержимого цитаты");
        WaitId.waitUntilPage(quotesPage.getDescriptionTextViewId());
        onView(quotesPage.getQuotesPageDescription()).check(matches(isDisplayed()));
    }
}
