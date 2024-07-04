package ru.iteco.fmhandroid.ui.pages;

import android.view.View;
import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.steps.NewsSteps;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class NewsPage {

    private final int MAIN_MENU_BUTTON_ID = R.id.main_menu_image_button;
    private final int NEWS_BUTTON_ID = android.R.id.title;
    private final int CONTROL_PANEL_BUTTON_ID = R.id.edit_news_material_button;
    private final int CLICK_NEWS_ITEM_ID = R.id.news_item_material_card_view;
    private final int DELETE_NEWS_ITEM_ID = R.id.delete_news_item_image_view;
    private final int SORT_BUTTON_ID = R.id.sort_news_material_button;
    private final int OK_DELETE_NEWS_BUTTON_ID = android.R.id.button1;
    private final int EDIT_NEWS_ITEM_ID = R.id.edit_news_item_image_view;
    private final int NEWS_TITLE_TEXT_FIELD_ID = R.id.news_item_title_text_input_edit_text;
    private final int SAVE_EDITING_NEWS_BUTTON_ID = R.id.save_button;
    private final int SWITCHER_ID = R.id.switcher;
    private final int FILTER_BUTTON_ID = R.id.filter_news_material_button;
    private final int FILTER_BUTTON_SAVE = R.id.filter_button;

    private final int FILTER_NEWS_CHECKBOX_ID = R.id.filter_news_active_material_check_box;
    private final int ADD_NEWS_BUTTON_ID = R.id.add_news_image_view;
    private final int CATEGORY_TEXT_FIELD_ID = R.id.news_item_category_text_auto_complete_text_view;
    private final int NEWS_TITLE_INPUT_ID = R.id.news_item_title_text_input_edit_text;
    private final int PUBLISH_DATE_INPUT_ID = R.id.news_item_publish_date_text_input_edit_text;
    private final int OK_DATE_BUTTON_ID = android.R.id.button1;
    private final int PUBLISH_TIME_INPUT_ID = R.id.news_item_publish_time_text_input_edit_text;
    private final int DESCRIPTION_INPUT_ID = R.id.news_item_description_text_input_edit_text;
    private final int OK_TIME_BUTTON_ID = android.R.id.button1;
    private final int SAVE_CREATING_NEWS_BUTTON_ID = R.id.save_button;
    private final int NEWS_ITEM_TITLE_CONTROL_PANEL = R.id.news_item_title_text_view;

    public Matcher<View> getNewsButtonMainMenu() {
        return withId(MAIN_MENU_BUTTON_ID);
    }

    public Matcher<View> getNewsElementsButtonNews() {
        return allOf(withId(NEWS_BUTTON_ID), withText("News"));
    }

    public Matcher<View> getNewsPageButtonControlPanel() {
        return withId(CONTROL_PANEL_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonClickNews() {
        return NewsSteps.withIndex(withId(CLICK_NEWS_ITEM_ID), 0);
    }

    public Matcher<View> getNewsPageButtonDeleteNews() {
        return NewsSteps.withIndex(withId(DELETE_NEWS_ITEM_ID), 0);
    }

    public Matcher<View> getNewsPageButtonSorting() {
        return withId(SORT_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonOkDeleteNews() {
        return withId(OK_DELETE_NEWS_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonEditNews() {
        return NewsSteps.withIndex(withId(EDIT_NEWS_ITEM_ID), 0);
    }

    public Matcher<View> getNewsTitleControlPanel() {
        return NewsSteps.withIndex(withId(NEWS_ITEM_TITLE_CONTROL_PANEL), 0);
    }

    public Matcher<View> getNewsPageButtonTitleNewsControlPanel() {
        return withId(NEWS_TITLE_TEXT_FIELD_ID);
    }

    public Matcher<View> getNewsPageButtonSaveEditingNews() {
        return withId(SAVE_EDITING_NEWS_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonSwitcher() {
        return withId(SWITCHER_ID);
    }

    public Matcher<View> getNewsPageFilterNewsControlPanel() {
        return withId(FILTER_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonFilterNewsControlPanel() {
        return withId(FILTER_BUTTON_SAVE);
    }

    public Matcher<View> getNewsPageRemoveCheckBoxActive() {
        return withId(FILTER_NEWS_CHECKBOX_ID);
    }

    public Matcher<View> getNewsPageElementsAddNews() {
        return withId(ADD_NEWS_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonCategoryCreatingNews() {
        return withId(CATEGORY_TEXT_FIELD_ID);
    }

    public Matcher<View> getNewsPageButtonTitleCreatingNews() {
        return withId(NEWS_TITLE_INPUT_ID);
    }

    public Matcher<View> getNewsPageButtonDateCreatingNews() {
        return withId(PUBLISH_DATE_INPUT_ID);
    }

    public Matcher<View> getNewsPageButtonOkDateCreatingNews() {
        return withId(OK_DATE_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonTimeCreatingNews() {
        return withId(PUBLISH_TIME_INPUT_ID);
    }

    public Matcher<View> getNewsPageDescriptionCreatingNews() {
        return withId(DESCRIPTION_INPUT_ID);
    }

    public Matcher<View> getNewsPageButtonOkTimeCreatingNews() {
        return withId(OK_TIME_BUTTON_ID);
    }

    public Matcher<View> getNewsPageButtonSaveCreatingNews() {
        return withId(SAVE_CREATING_NEWS_BUTTON_ID);
    }
}