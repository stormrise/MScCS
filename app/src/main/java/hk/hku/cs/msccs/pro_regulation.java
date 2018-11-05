package hk.hku.cs.msccs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class pro_regulation extends AppCompatActivity {
    private static ImageView regulation;
    private static TextView content_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_regulation);
        regulation=(ImageView)findViewById(R.id.regulation_img);
        Glide.with(regulation.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/Regulation.jpg")
                .into(regulation);
        content_6=(TextView)findViewById(R.id.reg_content_6);
        //String s1="The ";
        //s1+="<a href = 'http://www.baidu.com'>百度</a>";
        //content_6.setText(Html.fromHtml(s1));
        //content_6.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString span = new SpannableString("The regulations and syllabus are applicable to students admitted to the curriculum in 2018-2019 and thereafter.");
        span.setSpan(new URLSpan("https://www.msc-cs.hku.hk/Media/Default/RegulationSyllabus/Regulations_MSc_2017-18.pdf"), 4, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new URLSpan("https://www.msc-cs.hku.hk/Media/Default/RegulationSyllabus/Syllabus_MSc(CompSc)_2018-19.pdf"), 20, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        content_6.setText(span);
        content_6.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
