package com.rotoai.scoop_basics_d4.di;

import android.content.Context;
import android.view.View;

import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Provider;

import timber.log.Timber;

public class DaggerInjector implements HasScoopSubcomponentBuilder {
    public static final String SERVICE_NAME = "dagger";

    private Map<Class<?>, ScoopComponentBuilder> scoopComponentBuilderMap;

    public DaggerInjector(Map<Class<?>, ScoopComponentBuilder> map) {
        this.scoopComponentBuilderMap = map;
    }

    public <T> void inject(T obj) {
        try {
            scoopComponentBuilderMap.get(obj.getClass()).build().injectMembers(obj);
        } catch (Exception ex) {
            Timber.e(ex, "Failed to inject " + obj.getClass().getSimpleName(), obj);
        }
//        objectGraph.inject(obj);
    }

    public <T> T get(Class<T> clazz) {
        T t;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException instantationEx) {
            Timber.e(instantationEx, "Failed to instantiate " + clazz.getSimpleName(), clazz);
            return null;
        } catch (IllegalAccessException illegalAccess) {
            Timber.e(illegalAccess, "Illegal access for constructor " + clazz.getSimpleName(), clazz);
            return null;
        }
        inject(t);
        return t;
    }

//    public DaggerInjector extend(Map<Class<?>, ScoopComponentBuilder> subComponentMap) {
//        Map<Class<?>, ScoopComponentBuilder> copyMap = new HashMap<>(this.scoopComponentBuilderMap);
//        copyMap.putAll(subComponentMap);
//        return new DaggerInjector(copyMap);
//    }

    public static DaggerInjector fromScoop(Scoop scoop) {
        return scoop.findService(SERVICE_NAME);
    }

    public static DaggerInjector fromView(View view) {
        return Scoop.fromView(view).findService(SERVICE_NAME);
    }

    public static DaggerInjector fromContext(Context context) {
        return Scoop.fromContext(context).findService(SERVICE_NAME);
    }

    @Override
    public ScoopComponentBuilder getScoopComponentBuilder(Class<?> scoopObjectClass) {
        return scoopComponentBuilderMap.get(scoopObjectClass);
    }

    public static Scoop extend(final Scoop parentScoop,
                               final Map<Class<?>, ScoopComponentBuilder> subComponentMap) {
        final Screen parentScreen = Screen.fromScoop(parentScoop);
        final Scoop.Builder scoopBuilder = new Scoop.Builder(parentScreen.getClass().getSimpleName(), parentScoop)
                .service(Screen.SERVICE_NAME, parentScreen);

//        final DaggerInjector daggerInjector =
//                DaggerInjector.fromScoop(parentScoop).extend(subComponentMap);
        final DaggerInjector daggerInjector = DaggerInjector.fromScoop(parentScoop);

        return scoopBuilder
                .service(DaggerInjector.SERVICE_NAME, daggerInjector).build();
    }
}
