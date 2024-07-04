package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

import static ru.iteco.fmhandroid.ui.steps.NewsSteps.withIndex;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class QuotesPage {

    private static final int QUOTES_BUTTON_ID = R.id.our_mission_image_button;
    private static final int EXPAND_BUTTON_ID = R.id.our_mission_item_open_card_image_button;
    private static final int DESCRIPTION_TEXT_VIEW_ID = R.id.our_mission_item_description_text_view;

    public int getQuotesButtonId() {
        return QUOTES_BUTTON_ID;
    }

    public int getExpandButtonId() {
        return EXPAND_BUTTON_ID;
    }

    public int getDescriptionTextViewId() {
        return DESCRIPTION_TEXT_VIEW_ID;
    }

    public Matcher<View> getQuotesPageButton() {
        return allOf(withId(QUOTES_BUTTON_ID));
    }

    public Matcher<View> getQuotesPageButtonExpand() {
        return allOf(withIndex(withId(EXPAND_BUTTON_ID), 0));
    }

    public Matcher<View> getQuotesPageDescription() {
        return allOf(withIndex(withId(DESCRIPTION_TEXT_VIEW_ID), 0));
    }
}
