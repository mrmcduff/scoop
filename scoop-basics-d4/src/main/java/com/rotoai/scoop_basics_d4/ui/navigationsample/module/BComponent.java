package com.rotoai.scoop_basics_d4.ui.navigationsample.module;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.AController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.BController;

import dagger.Subcomponent;

/**
 * Created by mrmcduff on 11/10/17.
 */

@PerScoop
@Subcomponent(
        modules = BModule.class
)
public interface BComponent extends ScoopComponent<BController> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<BModule, BComponent> {
    }

//    @Module
//    class MainActivityModule extends ActivityModule<MainActivity> {
//        MainActivityModule(MainActivity activity) {
//            super(activity);
//        }
//    }
}
