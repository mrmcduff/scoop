package com.rotoai.scoop_basics_d3;

import com.rotoai.scoop_basics_d3.di.ScoopComponent;
import com.rotoai.scoop_basics_d3.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d3.multibind.AppScopeActivityBinder;
import com.rotoai.scoop_basics_d3.scoop.AppRouter;
import com.rotoai.scoop_basics_d3.scoop.DialogRouter;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Component;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Singleton
@Component(modules = {AppModule.class, AppScopeActivityBinder.class})
public interface AppComponent extends ScoopComponent<App>{
    void inject(App app);

    AppRouter appRouter();
    DialogRouter dialogRouter();
}
