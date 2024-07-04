package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class AboutPage {

    public static final int ABOUT_BUTTON_ID = android.R.id.title;
    public static final int PRIVACY_POLICY_BUTTON_ID = R.id.about_privacy_policy_value_text_view;
    public static final int TERMS_OF_USE_BUTTON_ID = R.id.about_terms_of_use_value_text_view;

    public Matcher<View> getAboutButtonMatcher() {
        return allOf(withId(ABOUT_BUTTON_ID), withText("About"));
    }

    public Matcher<View> getPrivacyPolicyButtonMatcher() {
        return withId(PRIVACY_POLICY_BUTTON_ID);
    }

    public Matcher<View> getTermsOfUseButtonMatcher() {
        return withId(TERMS_OF_USE_BUTTON_ID);
    }
}
