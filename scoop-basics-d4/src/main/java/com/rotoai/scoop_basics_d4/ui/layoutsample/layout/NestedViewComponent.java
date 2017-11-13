package com.rotoai.scoop_basics_d4.ui.layoutsample.layout;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;
import com.rotoai.scoop_basics_d4.ui.layoutsample.LayoutInjectData;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = NestedViewComponent.NestedViewModule.class)
public interface NestedViewComponent extends ScoopComponent<NestedView> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<NestedViewModule, NestedViewComponent> {
    }

    @Module
    class NestedViewModule extends ScoopModule<NestedView> {
        NestedViewModule(NestedView nestedView) {
            super(nestedView);
        }

        @Provides
        @PerScoop
        public LayoutInjectData provideInjectData() {
            return new LayoutInjectData("This is injected data.");
        }
    }
}
