package hk.hku.cs.msccs;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bin.david.form.core.SmartTable;
import com.bin.david.form.data.style.FontStyle;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class pro_course extends AppCompatActivity {
    @SuppressLint("StaticFieldLeak")
    private static ImageView course;
    private  static SmartTable<Course_table> table;  //使用smarttable构建表格


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_course);
        course =(ImageView)findViewById(R.id.course_img);
        Glide.with(course.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/Curriculum.jpg")
                .into(course);
        table= findViewById(R.id.table);
        List<Course_table> list=new ArrayList<>();  //装载课程名字
        list.add(new Course_table("Cyber Security", "COMP7806  Topic in information security"));
        list.add(new Course_table("Cyber Security", "COMP7901  Legal protection of digital property #"));
        list.add(new Course_table("Cyber Security", "COMP7903  Digital investigation and forensics"));
        list.add(new Course_table("Cyber Security", "COMP7904  Information security: attacks and defense"));
        list.add(new Course_table("Financial Computing", "COMP7103  Data Mining"));
        list.add(new Course_table("Financial Computing", "COMP7405  Techniques in computational finance"));
        list.add(new Course_table("Financial Computing", "COMP7406  Software development for quantitative finance"));
        list.add(new Course_table("Financial Computing", "COMP7407  Securities transaction banking"));
        list.add(new Course_table("Financial Computing", "COMP7408  Distributed ledger and blockchain technology #"));
        list.add(new Course_table("Financial Computing", "COMP7802  Introduction to financial computing"));
        list.add(new Course_table("Financial Computing", "COMP7808  Topic in financial computing"));
        list.add(new Course_table("Financial Computing", "COMP7906  Introduction to cyber security #"));

        list.add(new Course_table("Multimedia Computing", "COMP7502  Image processing and computer vision"));
        list.add(new Course_table("Multimedia Computing", "COMP7503  Multimedia technologies"));
        list.add(new Course_table("Multimedia Computing", "COMP7504  Pattern recognition and applications"));
        list.add(new Course_table("Multimedia Computing", "COMP7505  User interface design and development"));
        list.add(new Course_table("Multimedia Computing", "COMP7507  Visualization and visual analytics"));
        list.add(new Course_table("Multimedia Computing", "COMP7604  Game design and development"));
        list.add(new Course_table("Multimedia Computing", "COMP7807  Topic in multimedia computing"));


        list.add(new Course_table("General", "COMP7104  Advanced database systems #"));
        list.add(new Course_table("General", "COMP7201  Analysis and design of enterprise applications in UML"));
        list.add(new Course_table("General", "COMP7303  High-performance computing"));
        list.add(new Course_table("General", "COMP7305  Cluster and cloud computing"));
        list.add(new Course_table("General", "COMP7306  Web technologies"));
        list.add(new Course_table("General", "COMP7404  Computational intelligence and machine learning"));
        list.add(new Course_table("General", "COMP7606  Deep learning #"));
        list.add(new Course_table("General", "COMP7801  Topic in computer science"));
        list.add(new Course_table("General", "COMP7403  Computational molecular biology"));
        list.add(new Course_table("General", "COMP7304  The wireless Internet and mobile network"));
        list.add(new Course_table("General", "COMP7805  Topic in computer network and systems"));

        list.add(new Course_table("Dissertation", "COMP7704  Dissertation (24 credits)"));

        table.setData(list); //传入数据
        //设置表格样式
        table.getConfig().setContentStyle(new FontStyle(40, Color.BLUE));//文字样式
        table.getConfig().setColumnTitleStyle(new FontStyle(50, Color.YELLOW));//列名
        table.getConfig().setTableTitleStyle(new FontStyle(60, Color.YELLOW));//表名
        //不显示行号和列号；
        table.getConfig().setShowXSequence(false);
        table.getConfig().setShowYSequence(false);
        table.setBackgroundColor(Color.LTGRAY);

        //设置课程具体描述的连接；
        SpannableString span = new SpannableString("If you want to know more about courses, please click here !");
        //找到相应文字的位置，设置链接
        span.setSpan(new URLSpan("https://www.msc-cs.hku.hk/Media/Default/RegulationSyllabus/Syllabus_MSc(CompSc)_2018-19.pdf"), 52, 58, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //设置TextView
        TextView descrip=(TextView)findViewById(R.id.course_7);
        descrip.setText(span);

        //设置按钮跳转连接到ECOM的课程界面
        Button ecom=(Button)findViewById(R.id.ecom);
        ecom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.ecom-icom.hku.hk/Curriculum/Courses"));
                startActivity(intent);
            }
        });





    }
}
