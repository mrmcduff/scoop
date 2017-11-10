package com.rotoai.scoop_basics_d4.di;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ScoopModule<T> {

    protected final T scoopObject;

    public ScoopModule(T scoopObject) {
        this.scoopObject = scoopObject;
    }

    @Provides
    @PerScoop
    public T provideScoopObject() {
        return scoopObject;
    }
}
