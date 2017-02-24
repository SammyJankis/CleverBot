package com.arturoguillen.cleverbot;

import android.content.Context;

import com.arturoguillen.cleverbot.di.component.DaggerChatComponent;
import com.arturoguillen.cleverbot.di.component.TestChatComponent;
import com.arturoguillen.cleverbot.di.module.DataModule;
import com.arturoguillen.cleverbot.di.module.TestNetModule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import retrofit2.Retrofit;

/**
 * Created by arturo.guillen on 24/02/2017.
 */

public class TestChatComponentRule implements TestRule {
    private final TestChatComponent testChatComponent;
    private final Context context;

    public TestChatComponentRule(Context context) {
        this.context = context;
        App application = (App) context.getApplicationContext();
        this.testChatComponent = DaggerTestChatComponent.builder()
                .testNetModule(new TestNetModule())
                .dataModule(new DataModule(application))
                .build();
    }


    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                App application = (App) context.getApplicationContext();
                // Set the TestComponent before the test runs
                application.setComponent(testChatComponent);
                base.evaluate();
                // Clears the component once the tets finishes so it would use the default one.
                application.setComponent(null);
            }
        };
    }
}
