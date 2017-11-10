package com.rotoai.scoop_basics_d3.di;

import android.content.Context;
import android.view.View;

import com.lyft.scoop.Scoop;

import java.util.Map;

import javax.inject.Provider;

/**
 * Created by mrmcduff on 11/9/17.
 */

public class DaggerInjector implements ScoopComponentBuilderHost {

    public static final String SERVICE_NAME = "dagger";

    private Map<Class, Provider<ScoopComponentBuilder>> scoopComponentBuilderMap;

    public static DaggerInjector fromScoop(Scoop scoop) {
        return scoop.findService(SERVICE_NAME);
    }

    public static DaggerInjector fromView(View view) {
        return Scoop.fromView(view).findService(SERVICE_NAME);
    }

    public static DaggerInjector fromContext(Context context) {
        return Scoop.fromContext(context).findService(SERVICE_NAME);
    }

    public DaggerInjector(Map<Class, Provider<ScoopComponentBuilder>> scoopComponentBuilderMap) {
        this.scoopComponentBuilderMap = scoopComponentBuilderMap;
    }

    @Override
    public <T, B extends ScoopComponentBuilder<T, ? extends ScoopComponent<T>>> B
    getComponentBuilder(Class<T> key, Class<B> builderType) {
        return builderType.cast(scoopComponentBuilderMap.get(key).get());
    }
}
