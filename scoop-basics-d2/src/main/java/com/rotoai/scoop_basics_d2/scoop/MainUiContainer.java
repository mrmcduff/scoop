package com.rotoai.scoop_basics_d2.scoop;

import android.content.Context;
import android.util.AttributeSet;

import com.lyft.scoop.LayoutInflater;
import com.lyft.scoop.RouteChange;
import com.lyft.scoop.ScreenScooper;
import com.lyft.scoop.UiContainer;
import com.lyft.scoop.ViewControllerInflater;

import com.rotoai.scoop_basics_d2.AppComponent;
import com.rotoai.scoop_basics_d2.AppModule;
import com.rotoai.scoop_basics_d2.MainActivityComponent;
import com.rotoai.scoop_basics_d2.di.PerScoop;
import com.rotoai.scoop_basics_d2.di.ScoopInjector;
import com.rotoai.scoop_basics_d2.rx.ViewSubscriptions;
import com.rotoai.scoop_basics_d2.ui.Keyboard;
//import com.lyft.scoop.dagger.DaggerInjector;
//import com.lyft.scoop.dagger.DaggerLayoutInflater;
//import com.lyft.scoop.dagger.DaggerViewControllerInflater;

import javax.inject.Inject;

import dagger.Component;
import dagger.Module;
import io.reactivex.functions.Consumer;

//import rx.functions.Action1;

public abstract class MainUiContainer extends ComponentContainer<MainUiContainer> {

    @Inject
    AppRouter appRouter;

    @Inject
    ScreenScooper screenScooper;

    private ViewSubscriptions subscriptions = new ViewSubscriptions();

    public MainUiContainer(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (isInEditMode()) {
            return;
        }

//        DaggerInjector.fromView(this).inject(this);
    }

//    @Override
//    protected ViewControllerInflater getViewControllerInflater() {
//        return new DaggerViewControllerInflater();
//    }

//    @Override
//    protected LayoutInflater getLayoutInflater() {
//        return new DaggerLayoutInflater();
//    }

    @Override
    protected ScreenScooper getScreenScooper() {
        return screenScooper;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (isInEditMode()) {
            return;
        }

        subscriptions.add(appRouter.observeRouteChange(), routeChangeConsumer);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        subscriptions.unsubscribe();
    }

    private Consumer<RouteChange> routeChangeConsumer = new Consumer<RouteChange>() {
        @Override
        public void accept(RouteChange routeChange) throws Exception {
            // To prevent showing empty screen when activity is closed with "Back" button
            if (!routeChange.toPath.isEmpty()) {
                goTo(routeChange);
                Keyboard.hideKeyboard(MainUiContainer.this);
            }
        }
    };

    @Override
    ScoopInjector<MainUiContainer> getScoopInjector() {
        return null;
    }

    @PerScoop
    @dagger.Component
            (dependencies = {MainActivityComponent.class},
            modules = Module.class)
    interface Component {

    }

    @dagger.Module
    class Module {

    }
}
