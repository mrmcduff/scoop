package com.rotoai.scoop_basics_d3;

import com.rotoai.scoop_basics_d3.di.PerActivity;
import com.rotoai.scoop_basics_d3.di.ScoopComponent;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d3.multibind.MainActivityScoopBinder;
import com.rotoai.scoop_basics_d3.scoop.AppRouter;
import com.rotoai.scoop_basics_d3.scoop.DialogRouter;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.AController;

import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {MainActivityModule.class,
                MainActivityScoopBinder.class})
public interface MainActivityComponent extends ScoopComponent<MainActivity> {

    void inject(MainActivity activity);
//    void inject(MainUiContainer container);
//    void inject(DialogUiContainer container);

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<MainActivity, MainActivityComponent> {
    }

//    AppRouter appRouter();
//    DialogRouter dialogRouter();

}
