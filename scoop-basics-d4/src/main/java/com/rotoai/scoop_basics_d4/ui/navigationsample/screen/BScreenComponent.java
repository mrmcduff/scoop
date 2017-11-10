package com.rotoai.scoop_basics_d4.ui.navigationsample.screen;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = BScreenComponent.BScreenModule.class)
public interface BScreenComponent extends ScoopComponent<BScreen>{

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<BScreenModule, BScreenComponent> {
    }

    @Module
    class BScreenModule extends ScoopModule<BScreen> {
        public BScreenModule(BScreen screen) {
            super(screen);
        }
    }
}
