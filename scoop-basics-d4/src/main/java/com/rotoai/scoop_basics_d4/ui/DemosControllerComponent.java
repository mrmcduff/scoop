package com.rotoai.scoop_basics_d4.ui;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = DemosControllerComponent.DemosControllerModule.class)
public interface DemosControllerComponent extends ScoopComponent<DemosController> {

    @Subcomponent.Builder
    interface Builder extends
            ScoopComponentBuilder<DemosControllerModule, DemosControllerComponent> {
    }

    @Module
    class DemosControllerModule extends ScoopModule<DemosController> {
        DemosControllerModule(DemosController controller) {
            super(controller);
        }
    }
}
