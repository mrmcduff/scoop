package com.rotoai.scoop_basics_d4.ui.layoutsample.layout;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.lyft.scoop.ScreenTransition;
import com.lyft.scoop.transitions.FadeTransition;
import com.rotoai.scoop_basics_d4.R;
import com.rotoai.scoop_basics_d4.di.DaggerInjector;
import com.rotoai.scoop_basics_d4.di.ScoopComponentBuilder;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.ui.BaseViewController;

import java.util.Map;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class NestedLayoutViewController extends BaseViewController {

    @BindView(R.id.nested_layout_parent)
    FrameLayout nestedLayoutParent;

    @BindView(R.id.add_view_button)
    Button button;

    @Inject
    AppRouter appRouter;

    @Inject
    Map<Class<?>, ScoopComponentBuilder> subComponentBuilderMap;

    @Inject
    public NestedLayoutViewController() { }

    @OnClick(R.id.add_view_button)
    public void addView() {

        DaggerInjector.extend(getScoop(), subComponentBuilderMap)
                .inflate(R.layout.nested_view, nestedLayoutParent, true);
//        DaggerInjector.fromScoop(getScoop()).inject(view);
//        DaggerInjector.extend(getScoop(), new NestedViewModule())
//                .inflate(R.layout.nested_view, nestedLayoutParent, true);
        button.setVisibility(View.GONE);
    }

    @Override
    protected int layoutId() {
        return R.layout.nested_layout;
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

    @Override
    protected ScreenTransition enterTransition() {
        return new FadeTransition();
    }

    @Override
    protected ScreenTransition exitTransition() {
        return new FadeTransition();
    }
}
