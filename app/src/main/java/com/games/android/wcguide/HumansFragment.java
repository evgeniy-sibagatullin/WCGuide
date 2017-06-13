package com.games.android.wcguide;

import java.util.ArrayList;

public class HumansFragment extends RaceFragment {

    @Override
    protected ArrayList<String> getRaceHeroes() {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add(getString(R.string.hu_pa));
        heroes.add(getString(R.string.hu_am));
        heroes.add(getString(R.string.hu_mk));
        heroes.add(getString(R.string.hu_bm));
        return heroes;
    }
}
