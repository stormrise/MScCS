package hk.hku.cs.msccs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Resource extends AppCompatActivity implements View.OnClickListener{
    private static ImageView resource_img,envir_img,link_img;
    private static TextView envir_title,link_title;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.environment_img:
                //Toast.makeText(this,"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_1=new Intent(this,Environment.class);
                startActivity(intent_1);
                break;
            case R.id.environment_title:
                //Toast.makeText(this,"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_2=new Intent(this,Environment.class);
                startActivity(intent_2);
                break;
            case R.id.link_img:
                //Toast.makeText(this,"You clicked the picture",Toast.LENGTH_SHORT).show();
                Intent intent_3=new Intent(this,Link.class);
                startActivity(intent_3);
                break;
            case R.id.link_title:
                //Toast.makeText(this,"You clicked the text",Toast.LENGTH_SHORT).show();
                Intent intent_4=new Intent(this,Link.class);
                startActivity(intent_4);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_resource);
        resource_img=(ImageView)findViewById(R.id.resource_img);
        Glide.with(resource_img.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/StuRes.jpg")
                .into(resource_img);
        envir_img=(ImageView)findViewById(R.id.environment_img);
        Glide.with(envir_img.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/LearningEnvironment.jpg")
                .into(envir_img);
        link_img=(ImageView)findViewById(R.id.link_img);
        Glide.with(link_img.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/UsefulLinks.jpg")
                .into(link_img);
        envir_title=(TextView)findViewById(R.id.environment_title);
        link_title=(TextView)findViewById(R.id.link_title);
        envir_img.setOnClickListener(this);
        envir_title.setOnClickListener(this);
        link_title.setOnClickListener(this);
        link_img.setOnClickListener(this);

    }
}
