package com.rotoai.scoop_basics_d4.rx;

import android.os.Looper;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mrmcduff on 11/10/17.
 */

public class ViewSubscriptions {
    private final Scheduler observeOnScheduler;
    private final Scheduler subscribeOnScheduler;
    private CompositeDisposable subscriptions = new CompositeDisposable();

    public ViewSubscriptions() {
        this.subscribeOnScheduler = Schedulers.io();
        this.observeOnScheduler = AndroidSchedulers.mainThread();
    }

//    public <T> void add(Observable<T> observable, ResourceSubscriber<? super T> observer) {
//        if (Looper.myLooper() != Looper.getMainLooper()) { throw new AssertionError("Must be on main thread"); }
//        subscriptions.add(observable.subscribeOn(subscribeOnScheduler)
//        .observeOn(observeOnScheduler)
//        .unsubscribeOn(observeOnScheduler)
//                .subscribeWith(observer));
//        this.subscriptions.add(observable.subscribeOn(this.subscribeOnScheduler)
//                .observeOn(this.observeOnScheduler)
//                .unsubscribeOn(this.observeOnScheduler)
//                .subscribe(observer));
//    }

    public <T> void add(Observable<T> observable, Consumer<? super T> action) {
        if (Looper.myLooper() != Looper.getMainLooper()) { throw new AssertionError("Must be on main thread"); }
        this.subscriptions.add(
                observable
                        .subscribeOn(this.subscribeOnScheduler)
                        .observeOn(this.observeOnScheduler)
                        .subscribe(action));
    }

    public void unsubscribe() {
        this.subscriptions.clear();
        this.subscriptions = new CompositeDisposable();
    }
}
