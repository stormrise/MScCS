package hk.hku.cs.msccs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Environment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_environment);
        ImageView en_title=(ImageView)findViewById(R.id.en_title_img);
        Glide.with(en_title.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/LearningEnvironment.jpg")
                .into(en_title);
        ImageView office=(ImageView)findViewById(R.id.office);
        Glide.with(office.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ProgrammeOffice-1.jpg")
                .into(office);
        ImageView lounge=(ImageView)findViewById(R.id.lounge);
        Glide.with(lounge.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/P207.JPG")
                .into(lounge);
        ImageView common=(ImageView)findViewById(R.id.common);
        Glide.with(common.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/LearningCommons%20-ChiWah.jpg")
                .into(common);
        ImageView research=(ImageView)findViewById(R.id.research);
        Glide.with(research.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/Research-Group.jpg")
                .into(research);
        ImageView moodle=(ImageView)findViewById(R.id.moodle);
        Glide.with(moodle.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/Panopto-eg.jpg")
                .into(moodle);
        ImageView library=(ImageView)findViewById(R.id.library);
        Glide.with(moodle.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/MainLib.jpg")
                .into(library);


    }
}
