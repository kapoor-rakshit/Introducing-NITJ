package rkapoors.listpractice;

/**
 * Created by KAPOOR's on 26-06-2016.
 */
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class contacts extends ListActivity {
    String[] to={"director@nitj.ac.in","anandvaz@nitj.ac.in","agnihotriak@nitj.ac.in","aujlajs@nitj.ac.in","khoslaak@nitj.ac.in","bedir@nitj.ac.in"," sainibs@nitj.ac.in","chanders@nitj.ac.in","bansala@nitj.ac.in","registrar@nitj.ac.in",
            "","","asachdeva@nitj.ac.in","khanr@nitj.ac.in","shankaru@nitj.ac.in","bhadauriass@nitj.ac.in ","prakasha@nitj.ac.in","jaiswarsinghap@nitj.ac.in","paragk@nitj.ac.in"," manchandah@yahoo.co.in","singhlv@nitj.ac.in","malikp@nitj.ac.in","ramana@nitj.ac.in",
            "","","rajputj@nitj.ac.in","kaurs@nitj.ac.in","gargs@nitj.ac.in",
    "","","+919814753537","+919872904823","+919256147016",
            "","01813082100"}; //add emails

    String[] contc = {"Prof.(Dr) IK Bhat ( Director )","Dr. Joseph Anand Vaz, Dean (Academic)","Dr. A. Agnihotri,Dean (Planning and Development)","Dr. Jaspal Singh Aujla,Dean (Students Welfare)",
    "Dr. Arun Khosla,Dean (Research and Consultancy)","Dr. Raman Bedi,Associate Dean (Academic - UG)","Dr. B S Saini,Associate Dean (Planning and Development)","Dr. Subhash Chander, Associate Dean (Student Welfare)",
    "Dr. Ajay Bansal, Associate Dean (Research and consultancy)","Mr Ajit Singh ( Registrar )","","WARDENS (BOYS-HOSTEL)","Dr Anish Sachdeva, Chief Warden","Dr. Rizwan Khan, Warden and Deputy Chief Warden Hostel No.7",
    "Dr. Uma Shankar,Warden Hostel No.1","Dr Shailendra Badhuria,Warden Hostel No.2","Dr Aditya Prakash,Warden Hostel No.3","Dr Abhinav P Singh,Warden Hostel No.4","Dr Kumar Parag,Warden Hostel No.5","Dr Harsh Manchanda,Warden Hostel No.6","Dr Virender Singh,Warden Mega Boys Hostel-F",
     "Dr Parveen Malik,Warden Mega Boys Hostel-B<","Dr. Ashih Raman,Warden Mega Boys Hostel-A","","WARDENS (GIRLS-HOSTEL)","Dr Jaspreet Rajput,Warden Girls Hostel No.1","Dr Sarbrinder Kaur,Warden and Deputy Chief Warden Girls Hostel No.2","Dr Sangeeta Garg,Warden Mega Girls Hostel",
    "","MEDICAL TEAM","Dr Tarun Sehgal","Institute Ambulance","Institute Ambulance","","Main Gate NIT Jalandhar"};

   private ListView lv;

    //Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_contact);


       inputSearch = (EditText) findViewById(R.id.search);
       lv = (ListView) findViewById(android.R.id.list);
        // Binding resources Array to ListAdapter
        adapter=new ArrayAdapter<String>(this,R.layout.contactlist,R.id.label,contc);
       lv.setAdapter(adapter);
        Toast.makeText(contacts.this, "Tap or Search the contact to send email or call.", Toast.LENGTH_LONG).show();

       inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                contacts.this.adapter.getFilter().filter(cs);

                adapter.notifyDataSetChanged();
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

       String temp="";
        temp=l.getItemAtPosition(position).toString();
        int ll=contc.length;
for(int i=0;i<ll;i++)
{
    if(temp.equals(contc[i]))
    {
        position=i;
        break;
    }
}


        if(position!=10&&position!=11&&position!=23&&position!=24&&position!=28&&position!=29&&position!=33&&position!=30&&position!=31&&position!=32&&position!=34) {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);

            emailIntent.setData(Uri.parse("mailto:"));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{to[position]});

            try {
                startActivity(Intent.createChooser(emailIntent, "Send email via : "));
                finish();

            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(contacts.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }

       if(position==30||position==31||position==32||position==34) {
           Intent callIntent = new Intent(Intent.ACTION_CALL);
           callIntent.setData(Uri.parse("tel:" + to[position]));
           try {
               startActivity(callIntent);
           } catch (android.content.ActivityNotFoundException ex) {
               Toast.makeText(getApplicationContext(), "yourActivity is not founded", Toast.LENGTH_SHORT).show();
           }
       }
    }


}
