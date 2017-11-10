package com.rotoai.scoop_basics_d3;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.rotoai.scoop_basics_d3.di.ScoopComponent;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilderHost;
import com.rotoai.scoop_basics_d3.multibind.AppScopeActivityBinder;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

import timber.log.Timber;

/**
 * The core application object
 */
public class App extends Application implements ScoopComponentBuilderHost {

    private AppComponent appComponent;

    @Inject
    Map<Class, Provider<ScoopComponentBuilder>> scoopComponentBuilderMap;

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initializeWithDefaults(this);
        Timber.plant(new Timber.DebugTree());

        Timber.d("onCreate");

//        appComponent = DaggerAppComponent.builder()
//                .appModule(new AppModule(this))
//                .build();
//        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public <T, B extends ScoopComponentBuilder<T, ? extends ScoopComponent<T>>> B
    getComponentBuilder(Class<T> key, Class<B> builderType) {
        return builderType.cast(scoopComponentBuilderMap.get(key).get());
    }
}
