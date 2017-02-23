package com.arturoguillen.cleverbot.view;

import com.arturoguillen.cleverbot.BuildConfig;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ChatActivityTest {

    private ChatActivity chatActivity;

    @Before
    public void setUp() throws Exception {
        chatActivity = Robolectric.setupActivity(ChatActivity.class);
    }
}