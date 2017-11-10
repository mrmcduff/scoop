package com.rotoai.scoop_basics_d4.ui.navigationsample.module;

import com.rotoai.scoop_basics_d4.di.ScoopModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.AController;

import dagger.Module;

@Module
public class AModule extends ScoopModule<AController>{

    public AModule(AController controller) {
        super(controller);
    }
}
