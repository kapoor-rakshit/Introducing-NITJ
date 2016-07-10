package rkapoors.listpractice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KAPOOR's on 05-07-2016.
 */
public class prayaas extends Activity{
ImageView img;
    TextView t1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajbhasha);

        img=(ImageView)findViewById(R.id.logo);
        t1=(TextView)findViewById(R.id.headText);

        img.setImageResource(R.drawable.prayaas);
        t1.setText("With tagline \"An Hour a day,keeps illetracy away\".This society aims at providing free education to over 100 differently priveledged children,who are mostly the wards of the labour working for the construction project inside college.Not only restricted to them,it has now extended to other parts of Jalandhar city too.\nFor further information\n\nContact : XXXXXXXXX");
    }
}
