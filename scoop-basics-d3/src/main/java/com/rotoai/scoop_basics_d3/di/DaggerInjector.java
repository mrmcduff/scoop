package com.rotoai.scoop_basics_d3.di;

import android.content.Context;
import android.view.View;

import com.lyft.scoop.Scoop;

/**
 * Created by mrmcduff on 11/9/17.
 */

public class DaggerInjector {

    public static final String SERVICE_NAME = "dagger";

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
