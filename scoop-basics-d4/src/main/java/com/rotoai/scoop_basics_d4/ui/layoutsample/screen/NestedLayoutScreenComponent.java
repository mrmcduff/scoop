package com.rotoai.scoop_basics_d4.ui.layoutsample.screen;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = NestedLayoutScreenComponent.NestedLayoutScreenModule.class)
public interface NestedLayoutScreenComponent extends ScoopComponent<NestedLayoutScreen> {

    @Subcomponent.Builder
    interface Builder extends
            ScoopComponentBuilder<NestedLayoutScreenModule, NestedLayoutScreenComponent> {
    }

    @Module
    class NestedLayoutScreenModule extends ScoopModule<NestedLayoutScreen> {
        NestedLayoutScreenModule(NestedLayoutScreen screen) {
            super(screen);
        }
    }
}
