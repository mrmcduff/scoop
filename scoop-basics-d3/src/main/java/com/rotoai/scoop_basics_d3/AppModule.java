package com.rotoai.scoop_basics_d3;


import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;

import com.lyft.scoop.ScreenScoopFactory;
import com.lyft.scoop.ScreenScooper;
//import com.rotoai.scoop_basics_d2.di.ComponentScreenScoopFactory;
import com.rotoai.scoop_basics_d3.scoop.AppRouter;
import com.rotoai.scoop_basics_d3.scoop.DialogRouter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final App app;

    public AppModule(App app) {
        this.app = app;
    }

//    @Provides
//    ScreenScoopFactory provideDaggerScreenScooper() {
//        return new ComponentScreenScoopFactory();
//    }

    @Provides
    ScreenScooper provideScreenFactory(ScreenScoopFactory screenScoopFactory) {
        return new ScreenScooper(screenScoopFactory);
    }

    @Singleton
    @Provides
    AppRouter provideAppRouter() {
        return new AppRouter(false);
    }

    @Singleton
    @Provides
    DialogRouter provideDialogRouter() {
        return new DialogRouter(new AppRouter(true));
    }

    @Singleton
    @Provides
    Application provideApplication() {
        return app;
    }

    @Singleton
    @Provides
    NotificationManager provideNotificationManager() {
        return (NotificationManager) app.getSystemService(Context.NOTIFICATION_SERVICE);
    }
}

