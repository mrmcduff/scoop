package com.rotoai.scoop_basics_d4.ui.layoutsample.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rotoai.scoop_basics_d4.R;
import com.rotoai.scoop_basics_d4.di.DaggerInjector;
import com.rotoai.scoop_basics_d4.ui.layoutsample.LayoutInjectData;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NestedView extends LinearLayout {

    @BindView(R.id.nested_text_view)
    TextView nestedTextView;

    @Inject
    LayoutInjectData layoutInjectData;

    public NestedView(Context context, AttributeSet attrs) {
        super(context, attrs);
        DaggerInjector.fromView(this).inject(this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        if (isInEditMode()) {
            return;
        }

        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        nestedTextView.setText(layoutInjectData.getData());
    }
}
