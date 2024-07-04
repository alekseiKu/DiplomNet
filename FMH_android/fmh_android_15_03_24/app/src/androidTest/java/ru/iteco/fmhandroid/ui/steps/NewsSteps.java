package ru.iteco.fmhandroid.ui.steps;

import android.view.View;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.ui.pages.NewsPage;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.ui.pages.NewsPage.*;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitFor;
import static ru.iteco.fmhandroid.ui.pages.WaitId.waitUntilPage;

public class NewsSteps {

    private NewsPage newsPage;

    public NewsSteps() {
        newsPage = new NewsPage();
    }

    public void clickButtonMainMenu() {
        Allure.step("Нажать на кнопку Главное меню");
        waitUntilPage(newsPage.getNewsButtonMainMenu());
        waitFor(2);
        onView(newsPage.getNewsButtonMainMenu()).perform(click());
    }

    public void clickButtonNews() {
        Allure.step("Нажать на кнопку Новости на главной странице");
        waitUntilPage(newsPage.getNewsElementsButtonNews());
        onView(newsPage.getNewsElementsButtonNews()).perform(click());
    }

    public void clickButtonControlPanel() {
        Allure.step("Нажать на кнопку Панель управления");
        waitUntilPage(newsPage.getNewsPageButtonControlPanel());
        onView(newsPage.getNewsPageButtonControlPanel()).perform(click());
    }

    public void clickButtonSorting() {
        Allure.step("Нажать на кнопку сортировки новостей");
        waitUntilPage(newsPage.getNewsPageButtonSorting());
        onView(newsPage.getNewsPageButtonSorting()).perform(click());
    }

    public void clickButtonDeleteNews() {
        Allure.step("Нажать на кнопку удалить новость");
        waitUntilPage(newsPage.getNewsPageButtonDeleteNews());
        onView(newsPage.getNewsPageButtonDeleteNews()).perform(click());
    }

    public void clickClickNews() {
        Allure.step("Нажать на кнопку новости на главной странице мобильного приложения");
        waitUntilPage(newsPage.getNewsPageButtonClickNews());
        onView(newsPage.getNewsPageButtonClickNews()).perform(click());
    }

    public void clickOkDeleteNews() {
        Allure.step("Нажать на кнопку OK удалить новость");
        waitUntilPage(newsPage.getNewsPageButtonOkDeleteNews());
        onView(newsPage.getNewsPageButtonOkDeleteNews()).perform(click());
    }

    public void clickButtonEditNews() {
        Allure.step("Нажать на кнопку редактировать новость");
        waitUntilPage(newsPage.getNewsPageButtonEditNews());
        onView(newsPage.getNewsPageButtonEditNews()).perform(click());
    }

    public void clickButtonTitleNewsControlPanel() {
        Allure.step("Отредактировать название новости");
        waitUntilPage(newsPage.getNewsPageButtonTitleNewsControlPanel());
        onView(newsPage.getNewsPageButtonTitleNewsControlPanel()).perform(clearText(), replaceText("Отредактированный текст новости"), closeSoftKeyboard());
    }

    public void clickButtonSaveEditingNews() {
        Allure.step("Нажать на кнопку сохранить редактирование");
        waitUntilPage(newsPage.getNewsPageButtonSaveEditingNews());
        onView(newsPage.getNewsPageButtonSaveEditingNews()).perform(click());
    }

    public void clickButtonSwitcher() {
        Allure.step("Сменить статус");
        waitUntilPage(newsPage.getNewsPageButtonSwitcher());
        onView(newsPage.getNewsPageButtonSwitcher()).perform(click());
    }

    public void clickFilterNewsControlPanel() {
        Allure.step("Нажать на кнопку фильтровать Новости");
        waitUntilPage(newsPage.getNewsPageFilterNewsControlPanel());
        onView(newsPage.getNewsPageFilterNewsControlPanel()).perform(click());
    }

    public void clickButtonFilterNewsControlPanel() {
        Allure.step("Нажать на кнопку фильтровать");
        waitUntilPage(newsPage.getNewsPageButtonFilterNewsControlPanel());
        onView(newsPage.getNewsPageButtonFilterNewsControlPanel()).perform(click());
    }

    public void clickRemoveCheckBoxActive() {
        Allure.step("Снять флажок с чекбокса");
        waitUntilPage(newsPage.getNewsPageRemoveCheckBoxActive());
        onView(newsPage.getNewsPageRemoveCheckBoxActive()).perform(click());
    }

    public void clickAddNews() {
        Allure.step("Нажать на кнопку добавить новость");
        waitUntilPage(newsPage.getNewsPageElementsAddNews());
        onView(newsPage.getNewsPageElementsAddNews()).perform(click());
    }

    public void clickButtonCategoryCreatingNews() {
        Allure.step("Выбрать категорию для создания новости");
        waitUntilPage(newsPage.getNewsPageButtonCategoryCreatingNews());
        onView(newsPage.getNewsPageButtonCategoryCreatingNews()).perform(click());
    }

    public void clickButtonTitleCreatingNews() {
        Allure.step("Ввести в поле Заголовок название новости");
        waitUntilPage(newsPage.getNewsPageButtonTitleCreatingNews());
        onView(newsPage.getNewsPageButtonTitleCreatingNews()).perform(click(), clearText(), replaceText("Выдуманный текст"), closeSoftKeyboard());
    }

    public void clickButtonDateCreatingNews() {
        Allure.step("В поле Дата публикации выбрать дату по календарю");
        waitUntilPage(newsPage.getNewsPageButtonDateCreatingNews());
        onView(newsPage.getNewsPageButtonDateCreatingNews()).perform(click());
    }

    public void clickButtonOkDateCreatingNews() {
        Allure.step("Нажать кнопку ОК Дата");
        waitUntilPage(newsPage.getNewsPageButtonOkDateCreatingNews());
        onView(newsPage.getNewsPageButtonOkDateCreatingNews()).perform(click());
    }

    public void clickButtonTimeCreatingNews() {
        Allure.step("В поле Время выбрать время");
        waitUntilPage(newsPage.getNewsPageButtonTimeCreatingNews());
        onView(newsPage.getNewsPageButtonTimeCreatingNews()).perform(click());
    }

    public void clickDescriptionCreatingNews() {
        Allure.step("Ввести в поле Описание описание новости");
        waitUntilPage(newsPage.getNewsPageDescriptionCreatingNews());
        onView(newsPage.getNewsPageDescriptionCreatingNews()).perform(replaceText("Какой-то текст описания"), closeSoftKeyboard());
    }

    public void clickButtonOkTimeCreatingNews() {
        Allure.step("Нажать кнопку ОК Время");
        waitUntilPage(newsPage.getNewsPageButtonOkTimeCreatingNews());
        onView(newsPage.getNewsPageButtonOkTimeCreatingNews()).perform(click());
    }

    public void clickButtonSaveCreatingNews() {
        Allure.step("Нажать на кнопку Сохранить новость");
        waitUntilPage(newsPage.getNewsPageButtonSaveCreatingNews());
        onView(newsPage.getNewsPageButtonSaveCreatingNews()).perform(scrollTo(), click());
    }

    public void checkCreatedNews() {
        Allure.step("Проверить, что новость успешно создана");
        waitUntilPage(newsPage.getNewsTitleControlPanel());
        onView(newsPage.getNewsTitleControlPanel()).check(matches(withText("Выдуманный текст")));
    }


    public void checkEditedNews() {
        Allure.step("Проверить, что новость успешно отредактирована");
        waitUntilPage(newsPage.getNewsTitleControlPanel());
        onView(newsPage.getNewsTitleControlPanel()).check(matches(withText("Отредактированный текст новости")));
    }


    public void navigateToNewsControlPanel() {
        clickButtonMainMenu();
        clickButtonNews();
        clickButtonControlPanel();
    }

    public void fillAndSaveNewsDetails() {
        clickAddNews();
        clickButtonCategoryCreatingNews();
        clickButtonTitleCreatingNews();
        clickButtonDateCreatingNews();
        clickButtonOkDateCreatingNews();
        clickButtonTimeCreatingNews();
        clickButtonOkTimeCreatingNews();
        clickDescriptionCreatingNews();
        clickButtonSaveCreatingNews();
        checkCreatedNews();
    }

    public void editAndSaveNews() {
        clickButtonEditNews();
        clickButtonTitleNewsControlPanel();
        clickButtonSaveEditingNews();
        checkEditedNews();
    }

    public static Matcher<View> withIndex(final Matcher<View> matcher, final int index) {
        return new TypeSafeMatcher<View>() {
            int currentIndex = 0;

            @Override
            public void describeTo(Description description) {
                description.appendText("with index: ");
                description.appendValue(index);
                matcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                if (matcher.matches(view) && currentIndex++ == index) {
                    return true;
                }
                return false;
            }
        };
    }
}