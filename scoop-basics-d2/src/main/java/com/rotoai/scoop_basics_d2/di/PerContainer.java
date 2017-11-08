package com.rotoai.scoop_basics_d2.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Indicates that this scope is per {@link com.lyft.scoop.UiContainer}.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerContainer {
}
