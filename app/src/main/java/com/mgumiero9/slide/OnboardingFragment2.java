package com.mgumiero9.slide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mgumiero9 on 23/09/17.
 */

public class OnboardingFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle s) {

        return inflater.inflate(
                R.layout.onboarding_screen2,
                container,
                false
        );

    }
}
