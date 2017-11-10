package com.rotoai.scoop_basics_d4.ui;

import com.lyft.scoop.ViewController;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseViewController extends ViewController {

    private Unbinder unbinder;

    @Override
    public void onAttach() {
        super.onAttach();
        unbinder = ButterKnife.bind(this, getView());
    }

    @Override
    public void onDetach() {
        if (unbinder != null) {
            unbinder.unbind();
            unbinder = null;
        }

        super.onDetach();
    }
}
