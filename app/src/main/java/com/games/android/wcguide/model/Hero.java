package com.games.android.wcguide.model;

public class Hero {

    private final int mHeroName;
    private final int mImageResourceId;
    private final int mAudioResourceId;

    public Hero(int mHeroName, int mImageResourceId, int mAudioResourceId) {
        this.mHeroName = mHeroName;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public int getHeroName() {
        return mHeroName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hero hero = (Hero) o;

        return mHeroName == hero.mHeroName &&
                mImageResourceId == hero.mImageResourceId &&
                mAudioResourceId == hero.mAudioResourceId;

    }

    @Override
    public int hashCode() {
        int result = mHeroName;
        result = 31 * result + mImageResourceId;
        result = 31 * result + mAudioResourceId;
        return result;
    }
}
