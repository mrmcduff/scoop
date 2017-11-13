package com.rotoai.scoop_basics_d4.ui.layoutsample.layout;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;
import com.rotoai.scoop_basics_d4.ui.layoutsample.screen.NestedLayoutScreen;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = NestedLayoutViewControllerComponent.NestedLayoutViewControllerModule.class)
public interface NestedLayoutViewControllerComponent
        extends ScoopComponent<NestedLayoutViewController> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<NestedLayoutViewControllerModule,
            NestedLayoutViewControllerComponent> {
    }

    @Module
    class NestedLayoutViewControllerModule extends ScoopModule<NestedLayoutScreen> {
        NestedLayoutViewControllerModule(NestedLayoutScreen screen) {
            super(screen);
        }
    }
}
