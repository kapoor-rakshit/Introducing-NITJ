package rkapoors.listpractice;

/**
 * Created by KAPOOR's on 26-06-2016.
 */

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class courses extends ListActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // storing string resources into Array
        String[] branches = getResources().getStringArray(R.array.branches);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,R.id.label,branches));
        Toast.makeText(courses.this, "Tap over the branch to have a detailed view of subjects.", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onListItemClick(ListView l,View v,int position,long id) {
        super.onListItemClick(l,v,position,id);
        // selected item
        // String product = ((TextView) view).getText().toString();

        // Launching new Activity on selecting single List Item
        switch( position )
        {
            case 1:  Intent i1 = new Intent(getApplicationContext(), fy.class);
                startActivity(i1);
                break;
                    case 2:  Intent i2 = new Intent(getApplicationContext(), cs.class);
                        startActivity(i2);
                        break;
                  case 3:  Intent i3 = new Intent(getApplicationContext(), ec.class);
                        startActivity(i3);
                        break;
                   /* case 4:  Intent i4 = new Intent(getApplicationContext(), ic.class);
                        startActivity(i4);
                        break;*/
                   /* case 5:  Intent i5 = new Intent(getApplicationContext(), ch.class);
                        startActivity(i5);
                        break;*/
                    /*case 6:  Intent i6 = new Intent(getApplicationContext(), ce.class);
                        startActivity(i6);
                        break;*/
                  /*  case 7:  Intent i7 = new Intent(getApplicationContext(), tt.class);
                        startActivity(i7);
                        break;*/
            case 8:  Intent i8 = new Intent(getApplicationContext(), me.class);
                startActivity(i8);
                break;
            case 9:  Intent i9 = new Intent(getApplicationContext(), bio.class);
                startActivity(i9);
                break;
        }

        // sending data to new activity
        //i.putExtra("product", product);
        //startActivity(i);

    }

}
