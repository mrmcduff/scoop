package com.rotoai.scoop_basics_d2;

import com.rotoai.scoop_basics_d2.di.PerActivity;
import com.rotoai.scoop_basics_d2.scoop.AppRouter;
import com.rotoai.scoop_basics_d2.scoop.DialogRouter;
import com.rotoai.scoop_basics_d2.scoop.DialogUiContainer;
import com.rotoai.scoop_basics_d2.scoop.MainUiContainer;

import dagger.Component;

/**
 * Created by mrmcduff on 11/7/17.
 */

@PerActivity
@Component(dependencies = AppComponent.class,
        modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);
    void inject(MainUiContainer container);
    void inject(DialogUiContainer container);

    AppRouter appRouter();
    DialogRouter dialogRouter();

}
