package com.rotoai.scoop_basics_d2.di;

import android.content.Context;
import android.view.View;

import com.lyft.scoop.Scoop;

import dagger.MembersInjector;

/**
 * Created by mrmcduff on 11/8/17.
 */

public class DaggerInjector {

    static final String SERVICE_NAME = "dagger2";

    public DaggerInjector() {

    }

    public static DaggerInjector fromScoop(Scoop scoop) {
        return scoop.findService(SERVICE_NAME);
    }

    public static DaggerInjector fromView(View view) {
        return Scoop.fromView(view).findService(SERVICE_NAME);
    }

    public static DaggerInjector fromContext(Context context) {
        return Scoop.fromContext(context).findService(SERVICE_NAME);
    }
}
