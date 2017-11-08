package com.rotoai.scoop_basics_d2.scoop;

import android.content.Context;
import android.util.AttributeSet;

import com.lyft.scoop.LayoutInflater;
import com.lyft.scoop.RouteChange;
import com.lyft.scoop.ScreenScooper;
import com.lyft.scoop.UiContainer;
import com.lyft.scoop.ViewControllerInflater;
//import com.lyft.scoop.dagger.DaggerInjector;
//import com.lyft.scoop.dagger.DaggerLayoutInflater;
//import com.lyft.scoop.dagger.DaggerViewControllerInflater;
import com.rotoai.scoop_basics_d2.rx.ViewSubscriptions;
import com.rotoai.scoop_basics_d2.ui.Keyboard;

import javax.inject.Inject;

import io.reactivex.functions.Consumer;


public abstract class DialogUiContainer extends UiContainer {

    @Inject
    DialogRouter dialogRouter;

//    @Inject
//    ScreenScooper screenScooper;

    private ViewSubscriptions subscriptions = new ViewSubscriptions();

    public DialogUiContainer(Context context, AttributeSet attrs) {
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

//    @Override
//    protected ScreenScooper getScreenScooper() {
//        return screenScooper;
//    }
//
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (isInEditMode()) {
            return;
        }

        subscriptions.add(dialogRouter.observeDialogChange(), dialogChangeConsumer);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        subscriptions.unsubscribe();
    }

    private Consumer<RouteChange> dialogChangeConsumer = new Consumer<RouteChange>() {
        @Override
        public void accept(RouteChange routeChange) throws Exception {
            // To prevent showing empty screen when activity is closed with "Back" button
            if (!routeChange.toPath.isEmpty()) {
                goTo(routeChange);
                Keyboard.hideKeyboard(DialogUiContainer.this);
            }
        }
    };
}
