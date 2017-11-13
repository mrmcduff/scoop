package com.rotoai.scoop_basics_d4.ui.layoutsample.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.lyft.scoop.Screen;
import com.rotoai.scoop_basics_d4.R;
import com.rotoai.scoop_basics_d4.scoop.AppRouter;
import com.rotoai.scoop_basics_d4.ui.layoutsample.LayoutInjectData;
import com.rotoai.scoop_basics_d4.ui.layoutsample.screen.LayoutScreen;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LayoutView extends FrameLayout {

    @Inject
    AppRouter appRouter;

    @Inject
    LayoutInjectData layoutInjectData;

    @BindView(R.id.inject_text_view)
    TextView injectTextView;

    @BindView(R.id.param_text_view)
    TextView paramTextView;

    public LayoutView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (isInEditMode()) {
            return;
        }

        ButterKnife.bind(this, this);
        final LayoutScreen layoutScreen = Screen.fromView(this);
        paramTextView.setText(layoutScreen.getParam());
        injectTextView.setText(layoutInjectData.getData());
    }

    @OnClick(R.id.go_back_button)
    public void goBack() {
        appRouter.goBack();
    }
}
