package com.games.android.wcguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

class HeroAdapter extends ArrayAdapter<String> {

    HeroAdapter(Context context, List<String> units) {
        super(context, 0, units);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hero_list_item, parent, false);
        }

        TextView unitName = (TextView) listItemView.findViewById(R.id.hero_name);
        unitName.setText(getItem(position));

        return listItemView;
    }

}