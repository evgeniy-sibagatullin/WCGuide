package com.games.android.wcguide;

import java.util.ArrayList;

public class OrcsFragment extends RaceFragment {

    @Override
    protected ArrayList<String> getRaceHeroes() {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add(getString(R.string.or_bm));
        heroes.add(getString(R.string.or_fs));
        heroes.add(getString(R.string.or_tc));
        return heroes;
    }
}
