package ru.iteco.fmhandroid.ui.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class AuthorizationPage {

    private static final int ENTER_BUTTON_ID = R.id.enter_button;
    private static final int LOGIN_TEXT_INPUT_LAYOUT_ID = R.id.login_text_input_layout;
    private static final int PASSWORD_TEXT_INPUT_LAYOUT_ID = R.id.password_text_input_layout;
    private static final int AUTHORIZATION_IMAGE_BUTTON_ID = R.id.authorization_image_button;
    private static final int NAV_HOST_FRAGMENT_ID = R.id.nav_host_fragment;
    private static final int LOG_OUT_TITLE_ID = android.R.id.title;

    public int getEnterButtonId() {
        return ENTER_BUTTON_ID;
    }

    public int getLoginTextInputLayoutId() {
        return LOGIN_TEXT_INPUT_LAYOUT_ID;
    }

    public int getPasswordTextInputLayoutId() {
        return PASSWORD_TEXT_INPUT_LAYOUT_ID;
    }

    public int getAuthorizationImageButtonId() {
        return AUTHORIZATION_IMAGE_BUTTON_ID;
    }

    public int getNavHostFragmentId() {
        return NAV_HOST_FRAGMENT_ID;
    }

    public int getLogOutTitleId() {
        return LOG_OUT_TITLE_ID;
    }

    public Matcher<View> getLoginFieldMatcher() {
        return allOf(withHint("Login"), withParent(withParent(withId(LOGIN_TEXT_INPUT_LAYOUT_ID))));
    }

    public Matcher<View> getPasswordFieldMatcher() {
        return allOf(withHint("Password"), withParent(withParent(withId(PASSWORD_TEXT_INPUT_LAYOUT_ID))));
    }

    public Matcher<View> getLogOutButtonMatcher() {
        return allOf(withId(LOG_OUT_TITLE_ID), withText("Log out"));
    }

    public Matcher<View> getAuthorizationTextMatcher() {
        return allOf(withText("Authorization"), withParent(withParent(withId(NAV_HOST_FRAGMENT_ID))));
    }
}
