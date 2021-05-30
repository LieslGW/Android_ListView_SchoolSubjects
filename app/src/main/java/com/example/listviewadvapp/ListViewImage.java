package com.example.listviewadvapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewImage extends AppCompatActivity {
  ListView lv;




  public static Integer [] subjectImages={
          R.drawable.english,R.drawable.maths,R.drawable.chemistry,
          R.drawable.biology,R.drawable.physics,R.drawable.history,
          R.drawable.sociology,R.drawable.science,R.drawable.sport,
  };


  public static String[] subjectNames={
    "English","Maths","Chemistry","Biology","Physics","History","Sociology","Science","Sport"
  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

         MyListAdapter adapter =new MyListAdapter(this,subjectNames,subjectImages);
        lv= findViewById(R.id.listView2);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if (subjectNames[position].equalsIgnoreCase("English")){

                    showMessage("English",R.string.englishTxt,subjectImages[0]);

                }
                else if(subjectNames[position].equalsIgnoreCase("maths"))

                    showMessage("Maths",R.string.mathsTxt,subjectImages[1]);

               // Toast.makeText(ListViewImage.this,"You chose "+ subjectNames[position],Toast.LENGTH_SHORT).show();

                else if(subjectNames[position].equalsIgnoreCase("chemistry"))

                    showMessage("Chemistry",R.string.chemistryTxt,subjectImages[2]);

                else if(subjectNames[position].equalsIgnoreCase("biology"))

                    showMessage("Biology",R.string.biologyTxt,subjectImages[3]);

                else if(subjectNames[position].equalsIgnoreCase("physics"))

                    showMessage("Physics",R.string.physicsTxt,subjectImages[4]);

                else if(subjectNames[position].equalsIgnoreCase("history"))

                    showMessage("History",R.string.historyTxt,subjectImages[5]);

                else if(subjectNames[position].equalsIgnoreCase("sociology"))

                    showMessage("Sociology",R.string.sociologyTxt,subjectImages[6]);

                else if(subjectNames[position].equalsIgnoreCase("science"))

                    showMessage("Science",R.string.scienceTxt,subjectImages[7]);

                else if(subjectNames[position].equalsIgnoreCase("sport"))

                    showMessage("Sport",R.string.sportTxt,subjectImages[8]);
            }
        });
    }

    public void showMessage(String title,int Message, int icon){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.setIcon(icon);
        builder.show();


    }
}
