package com.rotoai.scoop_basics_d4.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Indicates that this scope is limited to one {@link com.lyft.scoop.Scoop}.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerScoop {
}
