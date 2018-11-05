package hk.hku.cs.msccs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class duration extends AppCompatActivity {
    private static ImageView duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_duration);
        duration=(ImageView)findViewById(R.id.duration_img);
        Glide.with(duration.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/Schedule.jpg")
                .into(duration);
    }
}
