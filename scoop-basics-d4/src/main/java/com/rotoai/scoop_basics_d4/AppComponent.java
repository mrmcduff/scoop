package com.rotoai.scoop_basics_d4;


import android.app.NotificationManager;

import com.lyft.scoop.ScreenScooper;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.scoop.DialogRouter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent{
    void inject(App app);

    AppRouter appRouter();
    DialogRouter dialogRouter();
    ScreenScooper screenScooper();
    NotificationManager notificationManager();
}
