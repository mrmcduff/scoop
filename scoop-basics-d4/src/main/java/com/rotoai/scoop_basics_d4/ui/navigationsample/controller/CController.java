package com.rotoai.scoop_basics_d4.ui.navigationsample.controller;

import com.lyft.scoop.ScreenTransition;
import com.lyft.scoop.transitions.BackwardSlideTransition;
import com.lyft.scoop.transitions.ForwardSlideTransition;
import com.rotoai.scoop_basics_d4.R;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.ui.BaseViewController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.AScreen;

import javax.inject.Inject;

import butterknife.OnClick;

public class CController extends BaseViewController {

    private AppRouter appRouter;

    @Inject
    public CController(AppRouter appRouter) {
        this.appRouter = appRouter;
    }

    @Override
    protected int layoutId() {
        return R.layout.c;
    }

    @Override
    public void onAttach() {
        super.onAttach();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @OnClick(R.id.reset_to_a_button)
    public void onClick() {
        appRouter.resetTo(new AScreen());
    }

    @Override
    protected ScreenTransition enterTransition() {
        return new ForwardSlideTransition();
    }

    @Override
    protected ScreenTransition exitTransition() {
        return new BackwardSlideTransition();
    }
}
