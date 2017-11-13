package com.rotoai.scoop_basics_d4.ui.layoutsample.screen;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = LayoutScreenComponent.LayoutScreenModule.class)
public interface LayoutScreenComponent extends ScoopComponent<LayoutScreen> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<LayoutScreenModule, LayoutScreenComponent> {
    }

    @Module
    class LayoutScreenModule extends ScoopModule<LayoutScreen> {
        LayoutScreenModule(LayoutScreen screen) {
            super(screen);
        }
    }
}
