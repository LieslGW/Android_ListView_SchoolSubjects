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
 private final String[] progNames;
 private final Integer[] progImages;

public MyListAdapter(Activity context,String[] progNames,Integer[] progImages)
{
    super(context, R.layout.activity_image_list, progNames);
    this.context=context;
    this.progNames=progNames;
    this.progImages=progImages;
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.activity_image_list,null,true);
        TextView txtTitle =(TextView) rowView.findViewById(R.id.textView2);
        ImageView ImageView=(ImageView) rowView.findViewById(R.id.imageView1);
        txtTitle.setText(progNames[position]);
        ImageView.setImageResource(progImages[position]);
        return rowView;


    }
}
