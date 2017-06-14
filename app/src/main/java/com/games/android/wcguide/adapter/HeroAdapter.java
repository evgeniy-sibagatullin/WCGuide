package com.games.android.wcguide.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.games.android.wcguide.R;
import com.games.android.wcguide.model.Hero;

import java.util.List;

public class HeroAdapter extends ArrayAdapter<Hero> {

    private Context mContext;
    private int mTextColorResId;

    public HeroAdapter(Context context, List<Hero> units, int textColorResId) {
        super(context, 0, units);
        mContext = context;
        mTextColorResId = textColorResId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hero_list_item, parent, false);
        }

        Hero hero = getItem(position);

        TextView heroName = (TextView) listItemView.findViewById(R.id.hero_name);
        heroName.setText(mContext.getString(hero.getHeroName()));

        int textColor = ContextCompat.getColor(getContext(), mTextColorResId);
        heroName.setTextColor(textColor);

        ImageView heroAvatar = (ImageView) listItemView.findViewById(R.id.hero_avatar);
        heroAvatar.setImageResource(hero.getImageResourceId());

        hero.getAudioResourceId();

        return listItemView;
    }
}