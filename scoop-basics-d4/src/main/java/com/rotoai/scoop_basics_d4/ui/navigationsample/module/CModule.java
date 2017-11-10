package com.rotoai.scoop_basics_d4.ui.navigationsample.module;

import com.rotoai.scoop_basics_d4.di.ScoopModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.CController;

import dagger.Module;

@Module
public class CModule extends ScoopModule<CController> {

    public CModule(CController controller) {
        super(controller);
    }
}
