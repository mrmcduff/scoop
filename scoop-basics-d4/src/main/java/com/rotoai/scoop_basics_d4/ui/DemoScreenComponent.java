package com.rotoai.scoop_basics_d4.ui;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = DemoScreenComponent.DemoScreenModule.class)
public interface DemoScreenComponent extends ScoopComponent<DemoScreen> {

    @Subcomponent.Builder
    interface Builder extends
            ScoopComponentBuilder<DemoScreenComponent.DemoScreenModule, DemoScreenComponent> {
    }

    @Module
    class DemoScreenModule extends ScoopModule<DemoScreen> {
        DemoScreenModule(DemoScreen screen) {
            super(screen);
        }
    }
}
