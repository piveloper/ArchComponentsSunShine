package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

/**
 * Created by P.Mohr on 22.09.2017.
 */
@Database(entities = {WeatherEntry.class}, version = 1)
@TypeConverters(DateConverter.class)
public abstract class SunshineDatabase extends RoomDatabase{
    public static final String DATABASE_NAME = "weather";

    public abstract WeatherDao weatherDao();
}
