package rkapoors.listpractice;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


public class fy extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String[] fycourses = getResources().getStringArray(R.array.fycourses);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fycourses));


    }


}
