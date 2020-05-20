package com.example.listviewadvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewImage extends AppCompatActivity {
  ListView lv;
  Context context;
  ArrayList progList;


  public static Integer [] progImages={
          R.drawable.one,R.drawable.two,R.drawable.three,
          R.drawable.four,R.drawable.five,R.drawable.six,
          R.drawable.seven,R.drawable.eight,R.drawable.nine,
  };
  public static String[] progNames={
    "C","C++","C#","Java","PHP","Android","Python","VB","Ruby"
  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

         MyListAdapter adapter =new MyListAdapter(this,progNames,progImages);
        lv=(ListView) findViewById(R.id.listView2);
        lv.setAdapter(adapter);
    }
}
