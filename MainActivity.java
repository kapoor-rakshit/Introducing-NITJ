package rkapoors.listpractice;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // storing string resources into Array
        String[] mainpage = getResources().getStringArray(R.array.mainpage);

        // Binding resources Array to ListAdapter
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,R.id.label,mainpage));
        Toast.makeText(MainActivity.this, "WELCOME to NITJ", Toast.LENGTH_LONG).show();
    }

        // listening to single list item on click
    @Override
        protected void onListItemClick(ListView l,View v,int position,long id) {
super.onListItemClick(l,v,position,id);
                // selected item
               // String product = ((TextView) view).getText().toString();

                // Launching new Activity on selecting single List Item
                switch( position )
                {
                    case 1:  Intent i1 = new Intent(getApplicationContext(), courses.class);
                        startActivity(i1);
                        break;
                    case 3:  Intent i3 = new Intent(getApplicationContext(), societies.class);
                        startActivity(i3);
                        break;
                  case 5:  Intent i5 = new Intent(getApplicationContext(), contacts.class);
                        startActivity(i5);
                        break;
                    case 7:  Intent i7 = new Intent(getApplicationContext(), gallery.class);
                        startActivity(i7);
                        break;
                }

                // sending data to new activity
                //i.putExtra("product", product);
                //startActivity(i);

            }

    }


