package com.arturoguillen.cleverbot;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.arturoguillen.cleverbot.view.ChatActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.robolectric.Robolectric;

@RunWith(AndroidJUnit4.class)
public class ChatActivityTest {

    public final TestChatComponentRule component =
            new TestChatComponentRule(InstrumentationRegistry.getTargetContext());

    public final ActivityTestRule<ChatActivity> main =
            new ActivityTestRule<ChatActivity>(ChatActivity.class, false, false) {
                @Override
                protected Intent getActivityIntent() {
                    // Override the default intent so we pass a false flag for syncing so it doesn't
                    // start a sync service in the background that would affect  the behaviour of
                    // this test.
                    return ChatActivity.getStartIntent(
                            InstrumentationRegistry.getTargetContext(), false);
                }
            };

    // TestComponentRule needs to go first to make sure the Dagger ApplicationTestComponent is set
    // in the Application before any Activity is launched.
    @Rule
    public final TestRule chain = RuleChain.outerRule(component).around(main);

    @Test
    public void listOfRibotsShows() {

        main.launchActivity(null);
    }
}