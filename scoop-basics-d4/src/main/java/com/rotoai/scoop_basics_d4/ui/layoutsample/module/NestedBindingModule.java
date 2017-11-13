package com.rotoai.scoop_basics_d4.ui.layoutsample.module;

import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.ui.layoutsample.layout.NestedView;
import com.rotoai.scoop_basics_d4.ui.layoutsample.layout.NestedViewComponent;
import com.rotoai.scoop_basics_d4.ui.layoutsample.screen.NestedLayoutScreen;
import com.rotoai.scoop_basics_d4.ui.layoutsample.screen.NestedLayoutScreenComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {NestedViewComponent.class, NestedLayoutScreenComponent.class})
public abstract class NestedBindingModule {

    @Binds
    @IntoMap
    @ClassKey(NestedView.class)
    public abstract ScoopComponentBuilder
        nestedViewComponentBuilder(NestedViewComponent.Builder impl);

    @Binds
    @IntoMap
    @ClassKey(NestedLayoutScreen.class)
    public abstract ScoopComponentBuilder
        nestedLayoutScreenComponentBuilder(NestedLayoutScreenComponent.Builder impl);
}
