package com.rotoai.scoop_basics_d4.scoop;

import com.rotoai.scoop_basics_d4.di.PerScoop;
import com.rotoai.scoop_basics_d4.di.ScoopComponent;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.di.ScoopModule;

import dagger.Module;
import dagger.Subcomponent;

@PerScoop
@Subcomponent(modules = DialogUiContainerComponent.DialogUiContainerModule.class)
public interface DialogUiContainerComponent extends ScoopComponent<DialogUiContainer> {

    @Subcomponent.Builder
    interface Builder extends ScoopComponentBuilder<DialogUiContainerModule, DialogUiContainerComponent> {
    }

    @Module
    class DialogUiContainerModule extends ScoopModule<DialogUiContainer> {
        DialogUiContainerModule(DialogUiContainer container) {
            super(container);
        }
    }
}
