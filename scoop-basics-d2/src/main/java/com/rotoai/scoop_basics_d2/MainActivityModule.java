package com.rotoai.scoop_basics_d2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mrmcduff on 11/7/17.
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
