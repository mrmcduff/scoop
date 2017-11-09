package com.rotoai.scoop_basics_d3.scoop;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.lyft.scoop.RouteChange;
import com.lyft.scoop.Router;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class AppRouter extends Router {

    private final BehaviorRelay<RouteChange> routeChangeRelay = BehaviorRelay.create();

    public AppRouter(boolean hasEmptyStack) {
        super(hasEmptyStack);
    }

    @Override
    protected void onRouteChanged(RouteChange routeChange) {
        routeChangeRelay.accept(routeChange);
    }

    public Observable<RouteChange> observeRouteChange() {
        return routeChangeRelay.observeOn(AndroidSchedulers.mainThread());
    }
}
