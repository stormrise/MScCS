package hk.hku.cs.msccs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class News extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.news1:
                Intent intent_1=new Intent(Intent.ACTION_VIEW);
                intent_1.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/admission-2019"));
                startActivity(intent_1);
                break;
            case R.id.news1_text:
                Intent intent_2=new Intent(Intent.ACTION_VIEW);
                intent_2.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/admission-2019"));
                startActivity(intent_2);
                break;
            case R.id.news2:
                Intent intent_3=new Intent(Intent.ACTION_VIEW);
                intent_3.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/hku-cs-career-fair-on-september-18-2018"));
                startActivity(intent_3);
                break;
            case R.id.news2_text:
                Intent intent_4=new Intent(Intent.ACTION_VIEW);
                intent_4.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/hku-cs-career-fair-on-september-18-2018"));
                startActivity(intent_4);
                break;
            case R.id.news3:
                Intent intent_5=new Intent(Intent.ACTION_VIEW);
                intent_5.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/msc-compsc-welcoming-reception-2018"));
                startActivity(intent_5);
                break;
            case R.id.news3_text:
                Intent intent_6=new Intent(Intent.ACTION_VIEW);
                intent_6.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/msc-compsc-welcoming-reception-2018"));
                startActivity(intent_6);
                break;
            case R.id.news4:
                Intent intent_7=new Intent(Intent.ACTION_VIEW);
                intent_7.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/2017-christmas-party-in-shanghai"));
                startActivity(intent_7);
                break;
            case R.id.news4_text:
                Intent intent_8=new Intent(Intent.ACTION_VIEW);
                intent_8.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/2017-christmas-party-in-shanghai"));
                startActivity(intent_8);
                break;
            case R.id.news5:
                Intent intent_9=new Intent(Intent.ACTION_VIEW);
                intent_9.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/graduation-dinner-2017"));
                startActivity(intent_9);
                break;
            case R.id.news5_text:
                Intent intent_10=new Intent(Intent.ACTION_VIEW);
                intent_10.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents/graduation-dinner-2017"));
                startActivity(intent_10);
                break;

            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_news);
        //装载图片
        ImageView news=(ImageView)findViewById(R.id.news_img);
        Glide.with(news.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/GraduatesAlumni.jpg")
                .into(news);

        ImageView news1=(ImageView)findViewById(R.id.news1_img);
        Glide.with(news1.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2018-19/Brochure2019.jpg")
                .into(news1);
        ImageView news2=(ImageView)findViewById(R.id.news2_img);
        Glide.with(news2.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2018-19/CareerFair2018Sep-5.jpg")
                .into(news2);
        ImageView news3=(ImageView)findViewById(R.id.news3_img);
        Glide.with(news3.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2018-19/WelcomingReception2018-1.jpg")
                .into(news3);
        ImageView news4=(ImageView)findViewById(R.id.news4_img);
        Glide.with(news4.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2017-18/Alumni-SH-Christmas1_s.jpg")
                .into(news4);
        ImageView news5=(ImageView)findViewById(R.id.news5_img);
        Glide.with(news5.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/NewsEvents/2017-18/GradDinner2017-1-m.jpg")
                .into(news5);
        TextView news1_text=(TextView)findViewById(R.id.news1_text);
        TextView news2_text=(TextView)findViewById(R.id.news2_text);
        TextView news3_text=(TextView)findViewById(R.id.news3_text);
        TextView news4_text=(TextView)findViewById(R.id.news4_text);
        TextView news5_text=(TextView)findViewById(R.id.news5_text);

        //设置点击事件
        news1.setOnClickListener(this);
        news2.setOnClickListener(this);
        news3.setOnClickListener(this);
        news4.setOnClickListener(this);
        news5.setOnClickListener(this);
        news4_text.setOnClickListener(this);
        news5_text.setOnClickListener(this);
        news1_text.setOnClickListener(this);
        news2_text.setOnClickListener(this);
        news3_text.setOnClickListener(this);
    }
}
