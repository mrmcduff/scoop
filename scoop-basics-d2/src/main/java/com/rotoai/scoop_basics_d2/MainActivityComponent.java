package com.rotoai.scoop_basics_d2;

import com.rotoai.scoop_basics_d2.di.PerActivity;

import dagger.Component;

/**
 * Created by mrmcduff on 11/7/17.
 */

@PerActivity
@Component(dependencies = AppComponent.class,
        modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);


}
