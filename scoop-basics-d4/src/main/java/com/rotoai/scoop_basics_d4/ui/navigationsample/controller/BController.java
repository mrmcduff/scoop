package com.rotoai.scoop_basics_d4.ui.navigationsample.controller;

import com.lyft.scoop.ScreenTransition;
import com.lyft.scoop.transitions.FadeTransition;
import com.rotoai.scoop_basics_d4.R;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.ui.BaseViewController;
import com.rotoai.scoop_basics_d4.ui.navigationsample.screen.CScreen;

import javax.inject.Inject;

import butterknife.OnClick;

public class BController extends BaseViewController {

    private AppRouter appRouter;

    @Inject
    public BController(AppRouter appRouter) {
        this.appRouter = appRouter;
    }

    @Override
    protected int layoutId() {
        return R.layout.b;
    }

    @Override
    public void onAttach() {
        super.onAttach();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @OnClick(R.id.go_back_button)
    public void goBack() {
        appRouter.goBack();
    }

    @OnClick(R.id.go_to_c_button)
    public void goToB() {
        appRouter.goTo(new CScreen());
    }

    @Override
    protected ScreenTransition enterTransition() {
        return new FadeTransition();
    }

    @Override
    protected ScreenTransition exitTransition() {
        return new FadeTransition();
    }
}
