package com.example.listviewadvapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewadvapp.R;

import java.util.zip.Inflater;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] subjectNames;
    private final Integer[] subjectImages;

    public MyListAdapter(Activity context,String[] subjectNames,Integer[] subjectImages)
    {
        super(context, R.layout.activity_image_list, subjectNames);
        this.context=context;
        this.subjectNames=subjectNames;
        this.subjectImages=subjectImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_image_list,null,true);
        TextView txtTitle = rowView.findViewById(R.id.textView2);
        ImageView ImageView= rowView.findViewById(R.id.imageView1);
        txtTitle.setText(subjectNames[position]);
        ImageView.setImageResource(subjectImages[position]);
        return rowView;


    }
}

