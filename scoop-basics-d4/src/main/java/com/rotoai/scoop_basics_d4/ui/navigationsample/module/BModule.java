package com.rotoai.scoop_basics_d4.ui.navigationsample.module;

import com.rotoai.scoop_basics_d4.di.ScoopModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.BController;

import dagger.Module;

@Module
public class BModule extends ScoopModule<BController> {

    public BModule(BController controller) {
        super(controller);
    }
}
