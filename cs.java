package rkapoors.listpractice;

/**
 * Created by KAPOOR's on 26-06-2016.
 */
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
public class cs extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String[] cscourses = getResources().getStringArray(R.array.cscourses);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cscourses));


    }
}
