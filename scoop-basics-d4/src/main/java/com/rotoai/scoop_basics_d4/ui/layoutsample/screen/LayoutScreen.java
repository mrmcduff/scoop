package com.rotoai.scoop_basics_d4.ui.layoutsample.screen;

import com.lyft.scoop.Layout;
import com.lyft.scoop.Screen;
import com.rotoai.scoop_basics_d4.R;

@Layout(R.layout.layout_sample)
public class LayoutScreen extends Screen {

    final String param;

    public LayoutScreen(final String param) {
        this.param = param;
    }

    public String getParam() {
        return this.param;
    }
}
