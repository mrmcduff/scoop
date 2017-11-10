package com.rotoai.scoop_basics_d4.di;

import android.content.Context;
import android.view.View;

import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;

import java.util.Map;

import javax.inject.Provider;

/**
 * Created by mrmcduff on 11/10/17.
 */

public class DaggerInjector implements HasScoopSubcomponentBuilder {
    public static final String SERVICE_NAME = "dagger";
//    private ObjectGraph objectGraph;

    private Map<Class<? extends Object>, ScoopComponentBuilder> scoopComponentBuilderMap;

    public DaggerInjector(Map<Class<? extends Object>, ScoopComponentBuilder> map) {
        this.scoopComponentBuilderMap = map;
    }

    public <T> void inject(T obj) {
//        objectGraph.inject(obj);
    }

//    public <T> T get(Class<T> clazz) {
//        return objectGraph.get(clazz);
//    }

//    public DaggerInjector extend(Object... modules) {
//        ObjectGraph objectGraph = this.objectGraph.plus(modules);
//        return new DaggerInjector(objectGraph);
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

    //    public static Scoop extend(final Scoop parentScoop, final Object... modules) {
//        final Screen parentScreen = Screen.fromScoop(parentScoop);
//        final Scoop.Builder scoopBuilder = new Scoop.Builder(parentScreen.getClass().getSimpleName(), parentScoop)
//                .service(Screen.SERVICE_NAME, parentScreen);
//        final DaggerInjector daggerInjector = DaggerInjector.fromScoop(parentScoop).extend(modules);
//
//        return scoopBuilder
//                .service(DaggerInjector.SERVICE_NAME, daggerInjector).build();
//    }
}
