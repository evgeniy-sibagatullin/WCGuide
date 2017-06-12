package com.games.android.wcguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class RacesPagerAdapter extends FragmentPagerAdapter {

    private static final int RACES_COUNT = 4;
    private Context mContext;

    RacesPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HumansFragment();
            case 1:
                return new OrcsFragment();
            case 2:
                return new NightElvesFragment();
            default:
                return new UndeadFragment();
        }
    }

    @Override
    public int getCount() {
        return RACES_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.humans);
            case 1:
                return mContext.getString(R.string.orcs);
            case 2:
                return mContext.getString(R.string.night_elves);
            default:
                return mContext.getString(R.string.undead);
        }
    }
}
