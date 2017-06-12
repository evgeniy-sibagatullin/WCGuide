package com.games.android.wcguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class RaceFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.race_fragment, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.race_title_text);
        textView.setText(getRaceTitle());

        return rootView;
    }

    protected abstract String getRaceTitle();

}
