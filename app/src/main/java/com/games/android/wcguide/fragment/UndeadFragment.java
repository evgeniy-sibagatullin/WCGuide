package com.games.android.wcguide.fragment;

import com.games.android.wcguide.R;
import com.games.android.wcguide.model.Hero;

import java.util.ArrayList;
import java.util.List;

public class UndeadFragment extends RaceFragment {

    @Override
    protected List<Hero> getRaceHeroes() {
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero(R.string.ud_dk, R.drawable.ud_dk, R.raw.ud_dk));
        heroes.add(new Hero(R.string.ud_dl, R.drawable.ud_dl, R.raw.ud_dl));
        heroes.add(new Hero(R.string.ud_li, R.drawable.ud_li, R.raw.ud_li));
        heroes.add(new Hero(R.string.ud_cl, R.drawable.ud_cl, R.raw.ud_cl));
        return heroes;
    }
}
