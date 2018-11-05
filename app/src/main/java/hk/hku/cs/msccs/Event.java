package hk.hku.cs.msccs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Event extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.event1:
                Intent intent_1=new Intent(Intent.ACTION_VIEW);
                intent_1.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/post-exhibition-of-msc-compsc-dissertations-summer-2018-july-5"));
                startActivity(intent_1);
                break;
            case R.id.event1_text:
                Intent intent_2=new Intent(Intent.ACTION_VIEW);
                intent_2.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/post-exhibition-of-msc-compsc-dissertations-summer-2018-july-5"));
                startActivity(intent_2);
                break;
            case R.id.event2:
                Intent intent_3=new Intent(Intent.ACTION_VIEW);
                intent_3.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/post-exhibition-of-msc-compsc-dissertations-spring-2018-april-6"));
                startActivity(intent_3);
                break;
            case R.id.event2_text:
                Intent intent_4=new Intent(Intent.ACTION_VIEW);
                intent_4.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/post-exhibition-of-msc-compsc-dissertations-spring-2018-april-6"));
                startActivity(intent_4);
                break;
            case R.id.event3:
                Intent intent_5=new Intent(Intent.ACTION_VIEW);
                intent_5.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/post-exhibition-of-msc-compsc-dissertations-spring-2018-april-6"));
                startActivity(intent_5);
                break;
            case R.id.event3_text:
                Intent intent_6=new Intent(Intent.ACTION_VIEW);
                intent_6.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/post-exhibition-of-msc-compsc-dissertations-spring-2018-march-27"));
                startActivity(intent_6);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_event);
        //装载图片
        ImageView event=(ImageView)findViewById(R.id.event_img);
        Glide.with(event.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/GraduatesAlumni.jpg")
                .into(event);

        ImageView event1=(ImageView)findViewById(R.id.event1_img);
        Glide.with(event1.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2017-18/PosterExdhibition2018Spring.jpg")
                .into(event1);
        ImageView event2=(ImageView)findViewById(R.id.event2_img);
        Glide.with(event2.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2017-18/PosterExdhibition2018Spring.jpg")
                .into(event2);
        ImageView event3=(ImageView)findViewById(R.id.event3_img);
        Glide.with(event3.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2017-18/PosterExdhibition2018Spring.jpg")
                .into(event3);
        TextView event1_text=(TextView)findViewById(R.id.event1_text);
        TextView event2_text=(TextView)findViewById(R.id.event2_text);
        TextView event3_text=(TextView)findViewById(R.id.event3_text);
        //设置点击事件
        event1.setOnClickListener(this);
        event2.setOnClickListener(this);
        event3.setOnClickListener(this);
        event1_text.setOnClickListener(this);
        event2_text.setOnClickListener(this);
        event3_text.setOnClickListener(this);


    }
}
