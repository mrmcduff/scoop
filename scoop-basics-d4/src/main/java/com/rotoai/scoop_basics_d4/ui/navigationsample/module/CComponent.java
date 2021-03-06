package com.rotoai.scoop_basics_d4.ui.navigationsample.module;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.CController;

import dagger.Subcomponent;

/**
 * Created by mrmcduff on 11/10/17.
 */

@PerScoop
@Subcomponent(
        modules = CModule.class
)
public interface CComponent extends ScoopComponent<CController> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<CModule, CComponent> {
    }

//    @Module
//    class MainActivityModule extends ActivityModule<MainActivity> {
//        MainActivityModule(MainActivity activity) {
//            super(activity);
//        }
//    }
}
