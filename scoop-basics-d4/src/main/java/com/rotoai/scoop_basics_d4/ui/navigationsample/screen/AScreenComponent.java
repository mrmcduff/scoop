package com.rotoai.scoop_basics_d4.ui.navigationsample.screen;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = AScreenComponent.AScreenModule.class)
public interface AScreenComponent extends ScoopComponent<AScreen>{

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<AScreenModule, AScreenComponent> {
    }

    @Module
    public class AScreenModule extends ScoopModule<AScreen> {
        AScreenModule(AScreen screen) {
            super(screen);
        }
    }
}
