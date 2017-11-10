package com.rotoai.scoop_basics_d4;

import com.rotoai.scoop_basics_d4.di.PerActivity;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.scoop.DialogRouter;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class,
        modules = {MainActivityModule.class, ScoopBindingModule.class})
public interface MainActivityComponent {

    void inject(MainActivity activity);
//    void inject(MainUiContainer container);
//    void inject(DialogUiContainer container);

}
