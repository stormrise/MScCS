package hk.hku.cs.msccs;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ProOverview extends AppCompatActivity {
    private static ImageView pro_img;
    private static ImageView cyber, financial,multimedia,general;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_overview);
        pro_img=(ImageView)findViewById(R.id.pro_img);
        Glide.with(pro_img.getContext()) //装载头部图片
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/ProgrammeOverview.jpg")
                .into(pro_img);
        //给每一个stream装载图片
        cyber=(ImageView)findViewById(R.id.cyber_img);
        multimedia=(ImageView)findViewById(R.id.mc_img);
        financial=(ImageView)findViewById(R.id.fc_img);
        general=(ImageView)findViewById(R.id.general_img);
        Glide.with(cyber.getContext()) //装载头部图片
                .load("https://www.msc-cs.hku.hk//Media/Default/ContentImages/InformationSecurity.jpg")
                .into(cyber);
        Glide.with(multimedia.getContext()) //装载头部图片
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/MultimediaComputing.jpg")
                .into(multimedia);
        Glide.with(financial.getContext()) //装载头部图片
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/FinancialComputing.jpg")
                .into(financial);
        Glide.with(general.getContext()) //装载头部图片
                .load("https://www.msc-cs.hku.hk//Media/Default/ContentImages/GeneralStream.jpg")
                .into(general);



    }
}
