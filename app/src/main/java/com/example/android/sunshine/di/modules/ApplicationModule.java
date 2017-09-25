package com.example.android.sunshine.di.modules;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.android.sunshine.SunshineApplication;
import com.example.android.sunshine.data.database.SunshineDatabase;
import com.example.android.sunshine.data.database.WeatherDao;
import com.example.android.sunshine.di.qualifiers.ApplicationContext;
import com.example.android.sunshine.utilities.SunshineDateUtils;

import java.util.Date;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Philipp on 24.09.2017.
 */
@Module
public class ApplicationModule {
    private SunshineApplication mApplication;

    public ApplicationModule(SunshineApplication mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    @Singleton
    SunshineApplication providesSunshineApplication(){
        return mApplication;
    }

    @Provides
    @ApplicationContext
    @Singleton
    Context providesApplicationContext(){
        return mApplication;
    }

    @Provides
    @Singleton
    SunshineDatabase providesDb(@ApplicationContext Context context){
        return Room.databaseBuilder(context,
                SunshineDatabase.class,SunshineDatabase.DATABASE_NAME).build();
    }

    @Provides
    @Singleton
    WeatherDao provideWeatherDao(SunshineDatabase database){
        return database.weatherDao();
    }

    @Provides
    Date provideDate(){
        return SunshineDateUtils.getNormalizedUtcDateForToday();
    }
}
