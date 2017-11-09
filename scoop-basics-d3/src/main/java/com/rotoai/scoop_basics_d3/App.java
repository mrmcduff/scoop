package com.rotoai.scoop_basics_d3;

import android.app.Application;

import com.facebook.stetho.Stetho;

import timber.log.Timber;

/**
 * The core application object
 */
public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initializeWithDefaults(this);
        Timber.plant(new Timber.DebugTree());

        Timber.d("onCreate");

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
