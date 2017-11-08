package com.rotoai.scoop_basics_d2;

import com.rotoai.scoop_basics_d2.scoop.AppRouter;
import com.rotoai.scoop_basics_d2.scoop.DialogRouter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);

    AppRouter appRouter();
    DialogRouter dialogRouter();
}
