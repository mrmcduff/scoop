package com.rotoai.scoop_basics_d2;

import dagger.Module;

@Module
public class AppModule {

    private final App app;

    public AppModule(App app) {
        this.app = app;
    }

}
