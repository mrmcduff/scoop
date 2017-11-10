package com.rotoai.scoop_basics_d4;

import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.AController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.BController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.CController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.AComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.AModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.BComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.BModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.CComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.CModule;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;


@Module(
        subcomponents = {
                AComponent.class,
                BComponent.class,
                CComponent.class
        })
public abstract class ScoopBindingModule {

    @Binds
    @IntoMap
    @ClassKey(AController.class)
    public abstract ScoopComponentBuilder aComponentBuilder(AComponent.Builder impl);

    @Binds
    @IntoMap
    @ClassKey(BController.class)
    public abstract ScoopComponentBuilder bComponentBuilder(BComponent.Builder impl);

    @Binds
    @IntoMap
    @ClassKey(CController.class)
    public abstract ScoopComponentBuilder cComponentBuilder(CComponent.Builder impl);

}
