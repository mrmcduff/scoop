package com.rotoai.scoop_basics_d2.scoop;

import android.content.Context;
import android.util.AttributeSet;

import com.lyft.scoop.UiContainer;
import com.rotoai.scoop_basics_d2.AppComponent;
import com.rotoai.scoop_basics_d2.MainActivityComponent;
import com.rotoai.scoop_basics_d2.di.PerScoop;
import com.rotoai.scoop_basics_d2.di.ScoopInjector;

import dagger.Component;

/**
 * Created by mrmcduff on 11/7/17.
 */

public abstract class ComponentContainer<T> extends UiContainer {

    public ComponentContainer(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (isInEditMode()) {
            return;
        }

//        DaggerInjector.fromView(this).inject(this);
    }

    abstract ScoopInjector<T> getScoopInjector();

}
