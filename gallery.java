package rkapoors.listpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

/**
 * Created by KAPOOR's on 05-07-2016.
 */
public class gallery extends FragmentActivity {

    private MyAdapter mAdapter;
    private ViewPager mPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mAdapter = new MyAdapter(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        // String aa=getResources().getString(R.string.app_name);
        Toast.makeText(gallery.this, "Swipe to discover NITJ", Toast.LENGTH_LONG).show();
    }
    public static class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 12;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ImageFragment(R.drawable.pic5);
                case 1:
                    return new ImageFragment(R.drawable.pic2);
                case 2:
                    return new ImageFragment(R.drawable.pic1);
                case 3:
                    return new ImageFragment(R.drawable.pic3);
                case 4:
                    return new ImageFragment(R.drawable.it);
                case 5:
                    return new ImageFragment(R.drawable.pic6);
                case 6:
                    return new ImageFragment(R.drawable.pic7);
                case 7:
                    return new ImageFragment(R.drawable.pic8);
                case 8:
                    return new ImageFragment(R.drawable.pic9);
                case 9:
                    return new ImageFragment(R.drawable.convo);
                case 10:
                    return new ImageFragment(R.drawable.utkansh);
                case 11:
                    return new ImageFragment(R.drawable.ncc);

                default:
                    return null;
            }
        }
    }

}
