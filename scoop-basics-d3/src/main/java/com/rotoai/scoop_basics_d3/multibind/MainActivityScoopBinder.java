package com.rotoai.scoop_basics_d3.multibind;

import com.rotoai.scoop_basics_d3.di.PerActivity;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d3.ui.navigationsample.component.AComponent;
import com.rotoai.scoop_basics_d3.ui.navigationsample.component.BComponent;
import com.rotoai.scoop_basics_d3.ui.navigationsample.component.CComponent;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.AController;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.BController;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.CController;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;


@Module(subcomponents = {
        AComponent.class,
        BComponent.class,
        CComponent.class
})
public abstract class MainActivityScoopBinder {

    @Binds
    @IntoMap
    @PerActivity
    @ClassKey(AController.class)
    abstract ScoopComponentBuilder aControllerBuilder(AComponent.Builder impl);

    @Binds
    @IntoMap
    @PerActivity
    @ClassKey(BController.class)
    abstract ScoopComponentBuilder bControllerBuilder(BComponent.Builder impl);

    @Binds
    @IntoMap
    @PerActivity
    @ClassKey(CController.class)
    abstract ScoopComponentBuilder cControllerBuilder(CComponent.Builder impl);

}
