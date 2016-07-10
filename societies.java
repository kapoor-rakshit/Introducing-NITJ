package rkapoors.listpractice;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by KAPOOR's on 26-06-2016.
 */

public class societies extends ListActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // storing string resources into Array
        String[] socname = getResources().getStringArray(R.array.socname);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,R.id.label,socname));
        Toast.makeText(societies.this, "Tap over a society to have an overview.", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l,v,position,id);
        // selected item
        // String product = ((TextView) view).getText().toString();

        // Launching new Activity on selecting single List Item
        switch( position )
        {
            case 1:  Intent i1 = new Intent(getApplicationContext(), lads.class);
                startActivity(i1);
                break;
            case 2:  Intent i2 = new Intent(getApplicationContext(), mads.class);
                startActivity(i2);
                break;
            case 3:  Intent i3 = new Intent(getApplicationContext(), prayaas.class);
                startActivity(i3);
                break;
            case 4:  Intent i4 = new Intent(getApplicationContext(), rajbhasha.class);
                startActivity(i4);
                break;
            case 5:  Intent i5 = new Intent(getApplicationContext(), women.class);
                startActivity(i5);
                break;
            case 6:  Intent i6 = new Intent(getApplicationContext(), rti.class);
                startActivity(i6);
                break;
        }

        // sending data to new activity
        //i.putExtra("product", product);
        //startActivity(i);

    }
}
