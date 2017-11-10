package com.rotoai.scoop_basics_d4.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Indicates that this scope is limited to one {@link android.app.Activity}.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}

