package com.example.sb.warda.languageapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordsAdapter extends ArrayAdapter<Words> {


    public WordsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Words> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       // View listItemView = convertView;
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.numbers_and_translation,parent,false);
        }
        TextView te
        return ;
    }

    //    public View getView(int position, View convertView, ViewGroup parent) {
//        // Check if an existing view is being reused, otherwise inflate the view
//        View listItemView = convertView;
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.list_item, parent, false);
//        }
//
//        // Get the {@link Word} object located at this position in the list
//        Word currentWord = getItem(position);
//
//        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
//        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
//        // Get the Miwok translation from the currentWord object and set this text on
//        // the Miwok TextView.
//        miwokTextView.setText(currentWord.getMiwokTranslation());
//
//        // Find the TextView in the list_item.xml layout with the ID default_text_view.
//        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
//        // Get the default translation from the currentWord object and set this text on
//        // the default TextView.
//        defaultTextView.setText(currentWord.getDefaultTranslation());
//
//        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
//        // the ListView.
//        return listItemView;
//    }
}
