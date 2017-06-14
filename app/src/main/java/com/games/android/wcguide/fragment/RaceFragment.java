package com.games.android.wcguide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.games.android.wcguide.R;
import com.games.android.wcguide.adapter.HeroAdapter;
import com.games.android.wcguide.model.Hero;

import java.util.List;

public abstract class RaceFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hero_list_fragment, container, false);

        HeroAdapter heroAdapter = new HeroAdapter(getActivity(), getRaceHeroes(), getTextColorResId());
        ListView listView = (ListView) rootView.findViewById(R.id.race_hero_list);
        listView.setAdapter(heroAdapter);

        return rootView;
    }

    protected abstract List<Hero> getRaceHeroes();

    protected abstract int getTextColorResId();

}
