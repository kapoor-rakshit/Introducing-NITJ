package rkapoors.listpractice;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by KAPOOR's on 27-06-2016.
 */

public class bio extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String[] biocourses = getResources().getStringArray(R.array.biocourses);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, biocourses));


    }
}
