package com.rotoai.scoop_basics_d3.multibind;

import com.rotoai.scoop_basics_d3.MainActivity;
import com.rotoai.scoop_basics_d3.MainActivityComponent;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilder;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;


@Module(subcomponents = {MainActivityComponent.class})
public abstract class AppScopeActivityBinder {

    @Binds
    @IntoMap
    @Singleton
    @ClassKey(MainActivity.class)
    abstract ScoopComponentBuilder componentBuilder(MainActivityComponent.Builder impl);
}
