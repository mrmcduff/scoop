package com.rotoai.scoop_basics_d2.di;

import android.content.Context;
import android.view.View;

import com.lyft.scoop.Scoop;

import javax.annotation.Nullable;

public class ScoopComponent {

    public static final String SERVICE_NAME = "component_holder";
    @Nullable private Object dependencyComponent;

    public ScoopComponent(Object dependencyComponent) {
        this.dependencyComponent = dependencyComponent;
    }

    @Nullable
    public <T> T getDependencyComponent(Class<T> clazz) {
        return clazz.cast(this.dependencyComponent);
    }

//    public <T> T get(Class<T> clazz) {
//        return dependencyComponent.get(clazz);
//    }

    @Nullable
    public static ScoopComponent fromScoop(Scoop scoop) {
        return scoop.findService(SERVICE_NAME);
    }

    @Nullable
    public static ScoopComponent fromView(View view) {
        return Scoop.fromView(view).findService(SERVICE_NAME);
    }

    @Nullable
    public static ScoopComponent fromContext(Context context) {
        return Scoop.fromContext(context).findService(SERVICE_NAME);
    }
}
