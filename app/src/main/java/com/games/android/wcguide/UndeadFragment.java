package com.games.android.wcguide;

import java.util.ArrayList;

public class UndeadFragment extends RaceFragment {

    @Override
    protected ArrayList<String> getRaceHeroes() {
        ArrayList<String> units = new ArrayList<>();
        units.add(getString(R.string.ud_dk));
        units.add(getString(R.string.ud_dl));
        units.add(getString(R.string.ud_li));
        return units;
    }
}
