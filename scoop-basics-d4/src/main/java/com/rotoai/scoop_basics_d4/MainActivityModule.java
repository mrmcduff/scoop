package com.rotoai.scoop_basics_d4;

import com.rotoai.scoop_basics_d4.di.PerActivity;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.scoop.DialogRouter;

import javax.inject.Singleton;

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
