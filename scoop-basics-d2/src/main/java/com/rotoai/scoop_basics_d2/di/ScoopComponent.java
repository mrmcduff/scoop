package com.rotoai.scoop_basics_d2.di;

import android.content.Context;
import android.view.View;

import com.lyft.scoop.Scoop;

/**
 * Created by mrmcduff on 11/7/17.
 */

public class ScoopComponent {

    private static final String SERVICE_NAME = "component_holder";
    private Object[] dependencies;

    public ScoopComponent(Object... dependencies) {
        this.dependencies = dependencies;
    }

    public static ScoopComponent fromScoop(Scoop scoop) {
        return scoop.findService(SERVICE_NAME);
    }

    public static ScoopComponent fromView(View view) {
        return Scoop.fromView(view).findService(SERVICE_NAME);
    }

    public static ScoopComponent fromContext(Context context) {
        return Scoop.fromContext(context).findService(SERVICE_NAME);
    }
}
