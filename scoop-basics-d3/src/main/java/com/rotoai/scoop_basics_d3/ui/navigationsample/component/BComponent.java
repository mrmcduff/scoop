package com.rotoai.scoop_basics_d3.ui.navigationsample.component;

import com.rotoai.scoop_basics_d3.di.ScoopComponent;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.BController;
import com.rotoai.scoop_basics_d3.ui.navigationsample.module.AModule;

import dagger.Subcomponent;

@Subcomponent (modules=AModule.class)
public interface BComponent extends ScoopComponent<BController> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<BController, BComponent> {

    }

}
