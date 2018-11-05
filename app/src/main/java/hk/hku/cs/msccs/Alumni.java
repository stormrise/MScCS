package hk.hku.cs.msccs;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Alumni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_alumni);
        ImageView alumni_img=(ImageView)findViewById(R.id.alumni_img);
        ImageView alumni_1=(ImageView)findViewById(R.id.alumni_1);
        Glide.with(alumni_img.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/GraduatesAlumni.jpg")
                .into(alumni_img);
        Glide.with(alumni_1)
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/GradDinner2017-2.jpg")
                .into(alumni_1);
    }
}
