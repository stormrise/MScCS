package hk.hku.cs.msccs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Link extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_link);
        ImageView title_img=(ImageView)findViewById(R.id.link_title_img);
        Glide.with(title_img.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/LearningEnvironment.jpg")
                .into(title_img);


    }
}
