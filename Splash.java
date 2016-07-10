package rkapoors.listpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/**
 * Created by KAPOOR's on 11-06-2016.
 */
public class Splash extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread time=new Thread()
        {
            public void run()
            {
                try{
                    sleep(3500);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally{
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        time.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }

}

