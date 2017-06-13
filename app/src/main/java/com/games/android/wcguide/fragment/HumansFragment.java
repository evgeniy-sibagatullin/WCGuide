package com.games.android.wcguide.fragment;

import com.games.android.wcguide.R;
import com.games.android.wcguide.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class HumansFragment extends RaceFragment {

    @Override
    protected List<Hero> getRaceHeroes() {
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero(R.string.hu_pa, R.drawable.hu_pa, R.raw.hu_pa));
        heroes.add(new Hero(R.string.hu_am, R.drawable.hu_am, R.raw.hu_am));
        heroes.add(new Hero(R.string.hu_mk, R.drawable.hu_mk, R.raw.hu_mk));
        heroes.add(new Hero(R.string.hu_bm, R.drawable.hu_bm, R.raw.hu_bm));
        return heroes;
    }
}
