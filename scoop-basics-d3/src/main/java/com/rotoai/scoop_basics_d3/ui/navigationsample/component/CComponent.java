package com.rotoai.scoop_basics_d3.ui.navigationsample.component;

import com.rotoai.scoop_basics_d3.di.ScoopComponent;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.CController;
import com.rotoai.scoop_basics_d3.ui.navigationsample.module.AModule;

import dagger.Subcomponent;

@Subcomponent (modules=AModule.class)
public interface CComponent extends ScoopComponent<CController> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<CController, CComponent> {

    }

}
