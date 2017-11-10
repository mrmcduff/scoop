package com.rotoai.scoop_basics_d4.scoop;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = MainUiContainerComponent.MainUiContainerModule.class)
public interface MainUiContainerComponent extends ScoopComponent<MainUiContainer> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<MainUiContainerModule, MainUiContainerComponent> {
    }

    @Module
    class MainUiContainerModule extends ScoopModule<MainUiContainer> {
        MainUiContainerModule(MainUiContainer container) {
            super(container);
        }
    }
}
