package com.rotoai.scoop_basics_d4;


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
}
