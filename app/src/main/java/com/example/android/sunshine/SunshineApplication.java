package com.example.android.sunshine;

import android.app.Application;

import com.example.android.sunshine.data.database.SunshineDatabase;
import com.example.android.sunshine.di.components.ApplicationComponent;
import com.example.android.sunshine.di.components.DaggerApplicationComponent;
import com.example.android.sunshine.di.modules.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Philipp on 24.09.2017.
 */

public class SunshineApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
