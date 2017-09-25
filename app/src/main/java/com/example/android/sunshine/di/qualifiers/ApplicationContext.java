package com.example.android.sunshine.di.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Philipp on 24.09.2017.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
}
