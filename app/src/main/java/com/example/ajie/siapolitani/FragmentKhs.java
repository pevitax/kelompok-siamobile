package com.example.ajie.siapolitani;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ASUS A455L on 03/05/2018.
 */

public class FragmentKhs  extends android.support.v4.app.Fragment{
    View view;
    public FragmentKhs() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.khs_fragment,container,false);
        return view;
    }
}
