package com.rotoai.scoop_basics_d4;

import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.scoop.MainUiContainer;
import com.rotoai.scoop_basics_d4.scoop.MainUiContainerComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.AController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.BController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.controller.CController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.AComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.AModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.BComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.BModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.CComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.module.CModule;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.AScreen;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.AScreenComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.BScreen;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.BScreenComponent;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.CScreen;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.CScreenComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;


@Module(
        subcomponents = {
                AComponent.class,
                BComponent.class,
                CComponent.class,
                AScreenComponent.class,
                BScreenComponent.class,
                CScreenComponent.class,
                MainUiContainerComponent.class
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

    @Binds
    @IntoMap
    @ClassKey(AScreen.class)
    public abstract ScoopComponentBuilder aScreenComponentBuilder(AScreenComponent.Builder impl);

    @Binds
    @IntoMap
    @ClassKey(BScreen.class)
    public abstract ScoopComponentBuilder bScreenComponentBuilder(BScreenComponent.Builder impl);

    @Binds
    @IntoMap
    @ClassKey(CScreen.class)
    public abstract ScoopComponentBuilder cScreenComponentBuilder(CScreenComponent.Builder impl);

    @Binds
    @IntoMap
    @ClassKey(MainUiContainer.class)
    public abstract ScoopComponentBuilder mainUiContainerComponentBuilder(
            MainUiContainerComponent.Builder impl);

}
