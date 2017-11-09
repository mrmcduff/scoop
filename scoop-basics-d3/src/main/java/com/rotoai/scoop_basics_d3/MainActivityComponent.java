package com.rotoai.scoop_basics_d3;

import com.rotoai.scoop_basics_d3.di.PerActivity;
import com.rotoai.scoop_basics_d3.scoop.AppRouter;
import com.rotoai.scoop_basics_d3.scoop.DialogRouter;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class,
        modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);
//    void inject(MainUiContainer container);
//    void inject(DialogUiContainer container);

    AppRouter appRouter();
    DialogRouter dialogRouter();

}
