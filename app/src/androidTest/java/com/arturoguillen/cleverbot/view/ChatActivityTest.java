package com.arturoguillen.cleverbot.view;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.arturoguillen.cleverbot.R;
import com.arturoguillen.cleverbot.presenter.ChatPresenter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import javax.inject.Inject;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

/**
 * Created by arturo.guillen on 27/02/2017.
 */

@RunWith(AndroidJUnit4.class)
public class ChatActivityTest {
    @Rule
    public ActivityTestRule<ChatActivity> activityRule = new ActivityTestRule<>(
            ChatActivity.class,
            true,
            false);

    @Test
    public void cleverBotModel_getReply_() {
        ChatActivity chatActivity = activityRule.launchActivity(new Intent());

        onView(withId(R.id.chat_send_btn)).perform(click());

        verify(chatActivity.presenter.cleverBotModel.cleverBotApi).getReply((String) Mockito.any(), (String) Mockito.any(), (String) Mockito.any());
    }
}
