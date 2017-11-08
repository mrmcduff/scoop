package com.rotoai.scoop_basics_d2.di;

/**
 * Created by mrmcduff on 11/7/17.
 */

public interface ScoopInjector<T> {

    void inject(T t);
}
