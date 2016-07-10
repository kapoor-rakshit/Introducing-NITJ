package rkapoors.listpractice;

/**
 * Created by KAPOOR's on 27-06-2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by KAPOOR's on 27-06-2016.
 */
public class women extends Activity{
    ImageButton img;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        img=(ImageButton) findViewById(R.id.ib);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new  String[]{"womencell@nitj.ac.in"});

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send email via : "));
                    finish();

                }
                catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(women.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

