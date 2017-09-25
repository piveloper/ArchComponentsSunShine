package com.example.android.sunshine.di.components;

import android.content.Context;

import com.example.android.sunshine.SunshineApplication;
import com.example.android.sunshine.data.database.SunshineDatabase;
import com.example.android.sunshine.data.database.WeatherDao;
import com.example.android.sunshine.data.network.SunshineSyncIntentService;
import com.example.android.sunshine.di.modules.ApplicationModule;
import com.example.android.sunshine.di.qualifiers.ApplicationContext;
import com.example.android.sunshine.ui.detail.DetailActivity;

import java.util.Date;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Philipp on 24.09.2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(SunshineApplication sunshineApplication);

    void inject(DetailActivity activity);

    void inject(SunshineSyncIntentService service);

    @ApplicationContext Context getApplicationContext();

    @ApplicationContext SunshineApplication getApplication();

    SunshineDatabase getSunShineDatabase();

    WeatherDao getWeatherDao();

    Date getAppDate();
}
