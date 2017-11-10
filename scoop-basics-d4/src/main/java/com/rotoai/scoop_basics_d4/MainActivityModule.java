package com.rotoai.scoop_basics_d4;

import dagger.Module;
import dagger.Provides;

/**
 * Main activity module, used as a dependent module rather than a submodule.
 */
@Module
public class MainActivityModule {

    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    MainActivity provideActivity() {
        return mainActivity;
    }

}
