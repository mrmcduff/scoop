package com.rotoai.scoop_basics_d2.di;

import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ScreenScoopFactory;


public class ComponentScreenScoopFactory extends ScreenScoopFactory {

    @Override
    protected Scoop addServices(Scoop.Builder scoopBuilder, Screen screen, Scoop parentScoop) {
        ScoopComponent parentComponent = ScoopComponent.fromScoop(parentScoop);
        Object parentDependency = parentComponent.getDependencyComponent(Object.class);

        if (parentDependency == null) {
            return scoopBuilder.service(ScoopComponent.SERVICE_NAME, parentComponent).build();
        }

        return scoopBuilder
                .service(ScoopComponent.SERVICE_NAME,
                        new ScoopComponent(parentDependency)).build();
    }
}
