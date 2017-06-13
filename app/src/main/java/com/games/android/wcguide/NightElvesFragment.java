package com.games.android.wcguide;

import java.util.ArrayList;

public class NightElvesFragment extends RaceFragment {

    @Override
    protected ArrayList<String> getRaceHeroes() {
        ArrayList<String> units = new ArrayList<>();
        units.add(getString(R.string.ne_dh));
        units.add(getString(R.string.ne_kg));
        units.add(getString(R.string.ne_pm));
        return units;
    }
}
