package com.lyft.scoop;

import android.view.View;
import android.view.ViewGroup;

public class LayoutInflater {

    public View inflateView(
            Scoop scoop,
            Screen screen,
            ViewGroup viewGroup) {

        return scoop.inflate(screen.getLayout(), viewGroup, false);
    }
}
