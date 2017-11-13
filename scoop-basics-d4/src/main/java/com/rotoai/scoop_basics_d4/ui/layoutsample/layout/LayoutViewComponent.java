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
@Subcomponent(modules = LayoutViewComponent.LayoutViewModule.class)
public interface LayoutViewComponent extends ScoopComponent<LayoutView> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<LayoutViewModule, LayoutViewComponent> {
    }

    @Module
    class LayoutViewModule extends ScoopModule<LayoutView> {
        LayoutViewModule(LayoutView layoutView) {
            super(layoutView);
        }

        @Provides
        @PerScoop
        public LayoutInjectData provideInjectData() {
            return new LayoutInjectData("This is injected data, though it doesn't show up.");
        }
    }

//    @Module
//    class LayoutParamsModule {
//        private String text;
//
//        LayoutParamsModule(String text) {
//            this.text = text;
//        }
//
//        @Provides
//        @PerScoop
//        public LayoutInjectData provideInjectData() {
//            return new LayoutInjectData(text);
//        }
//    }
}
