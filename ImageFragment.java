package rkapoors.listpractice;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageFragment extends Fragment {

    private final int imageResourceId;

    public ImageFragment(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_image_fragment, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        imageView.setImageResource(imageResourceId);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        if(imageResourceId==R.drawable.pic1)
            textView.setText("           Guest House");
        if(imageResourceId==R.drawable.pic2)
            textView.setText("           Main Building");
        else if(imageResourceId==R.drawable.pic3)
            textView.setText("Central Seminar Hall(CSH)");
        else if(imageResourceId==R.drawable.it)
            textView.setText("              IT Park");
        else if(imageResourceId==R.drawable.pic5)
            textView.setText("              IT Park");
        else if(imageResourceId==R.drawable.pic6)
            textView.setText("             Canteen");
        else if(imageResourceId==R.drawable.pic7)
            textView.setText("         A Greener NITJ");
        else if(imageResourceId==R.drawable.pic8)
            textView.setText("                  OAT");
        else if(imageResourceId==R.drawable.convo)
            textView.setText("Celebrations Unlimited @ NITJ");
        else if(imageResourceId==R.drawable.utkansh)
            textView.setText("    Utkansh-Cultural Fest");
        else if(imageResourceId==R.drawable.ncc)
            textView.setText("Prepared to serve the nation");
        else if(imageResourceId==R.drawable.pic9)
            textView.setText("Manufacturing Processes Lab");
        return view;
    }

}
