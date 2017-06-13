package com.games.android.wcguide.fragment;

import com.games.android.wcguide.R;
import com.games.android.wcguide.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class OrcsFragment extends RaceFragment {

    @Override
    protected List<Hero> getRaceHeroes() {
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero(R.string.or_bm, R.drawable.or_bm, R.raw.or_bm));
        heroes.add(new Hero(R.string.or_fs, R.drawable.or_fs, R.raw.or_fs));
        heroes.add(new Hero(R.string.or_tc, R.drawable.or_tc, R.raw.or_tc));
        heroes.add(new Hero(R.string.or_sh, R.drawable.or_sh, R.raw.or_sh));
        return heroes;
    }
}
