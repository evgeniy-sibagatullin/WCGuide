package com.games.android.wcguide.fragment;

import com.games.android.wcguide.R;
import com.games.android.wcguide.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class NightElvesFragment extends RaceFragment {

    @Override
    protected List<Hero> getRaceHeroes() {
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero(R.string.ne_dh, R.drawable.ne_dh, R.raw.ne_dh));
        heroes.add(new Hero(R.string.ne_kg, R.drawable.ne_kg, R.raw.ne_kg));
        heroes.add(new Hero(R.string.ne_pm, R.drawable.ne_pm, R.raw.ne_pm));
        heroes.add(new Hero(R.string.ne_wa, R.drawable.ne_wa, R.raw.ne_wa));
        return heroes;
    }
}
