package com.rotoai.scoop_basics_d4.ui.navigationsample.screen;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = CScreenComponent.CScreenModule.class)
public interface CScreenComponent extends ScoopComponent<CScreen> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<CScreenModule, CScreenComponent> {
    }

    @Module
    class CScreenModule extends ScoopModule<CScreen> {
        public CScreenModule(CScreen screen) {
            super(screen);
        }
    }
}
