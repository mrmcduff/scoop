package com.rotoai.scoop_basics_d4.di;

import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import com.lyft.scoop.ScreenScoopFactory;

public class DaggerScreenScoopFactory extends ScreenScoopFactory {

    @Override
    protected Scoop addServices(Scoop.Builder scoopBuilder, Screen screen, Scoop parentScoop) {
        DaggerInjector parentDagger = DaggerInjector.fromScoop(parentScoop);
        return scoopBuilder.service(DaggerInjector.SERVICE_NAME, parentDagger).build();

        // Right now we don't have the concept of extension, since there is no subcomponent level
        // for a scoop dynamically decided.
//        DaggerModule daggerModule = screen.getClass().getAnnotation(DaggerModule.class);
//
//        if (daggerModule == null) {
//            return scoopBuilder.service(DaggerInjector.SERVICE_NAME, parentDagger).build();
//        }
//
//        DaggerInjector screenInjector;
//
//        try {
//            final Object module = daggerModule.value().newInstance();
//            screenInjector = parentDagger.extend(module);
//        } catch (Throwable e) {
//            throw new RuntimeException("Failed to instantiate module for screen: " + screen.getClass().getSimpleName(), e);
//        }
//
//        return scoopBuilder
//                .service(DaggerInjector.SERVICE_NAME, screenInjector).build();
    }
}
