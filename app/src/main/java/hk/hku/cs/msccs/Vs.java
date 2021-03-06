package hk.hku.cs.msccs;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;
import com.bin.david.form.core.TableConfig;
import com.bin.david.form.data.column.Column;
import com.bin.david.form.data.column.ColumnInfo;
import com.bin.david.form.data.style.FontStyle;
import com.bin.david.form.listener.OnColumnClickListener;
import com.bin.david.form.listener.OnColumnItemClickListener;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Vs extends AppCompatActivity{

    @SmartTable(name = "VS Other School")
    public class School_table {
        School_table(String School,String major,String stream,String duration,String fee,String requirement, String Courselist){
            this.School=School;
            this.major=major;
            this.stream=stream;
            this.duration=duration;
            this.fee=fee;
            this.requirement=requirement;
            this.Courselist=Courselist;
        }

        @SmartColumn(id=1,name ="School",autoMerge = true,fixed = true)
        private String School;

        @SmartColumn(id=2,name="Major",align=Paint.Align.LEFT)
        private String major;

        @SmartColumn(id=3,name="Stream",align=Paint.Align.LEFT)
        private String stream;

        @SmartColumn(id=4,name="Duration",align=Paint.Align.LEFT)
        private String duration;

        @SmartColumn(id=5,name="Fee",align=Paint.Align.LEFT)
        private String fee;

        @SmartColumn(id=6,name="Requirement",align=Paint.Align.LEFT)
        private String requirement;

        @SmartColumn(id=7,name="Course List",align=Paint.Align.LEFT)
        private String Courselist;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs);

        ImageView vsImage = findViewById(R.id.vs_image);
        Glide.with(vsImage.getContext())
                .load(R.drawable.vs)
                .into(vsImage);

        //使用smarttable构建表格
        com.bin.david.form.core.SmartTable<School_table> table = findViewById(R.id.table_vs);
        List<School_table> list=new ArrayList<>();  //装载课程名字
        list.add(new School_table(
                "HKU",
                "Master of Science in Computer Science",
                "General\n" +
                        "Financial computing\n" +
                        "Multimedia\n" +
                        "Security",
                "1-2 years",
                "132,000 HKD",
                "IELTS: a minimum overall band of 6 with no subtest lower than 5.5; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                "https://www.msc-cs.hku.hk/Curriculum/Courses"));
        list.add(new School_table(
                "HKUST",
                "Master of Science in Big Data Technology",
                "",
                "1 year",
                "210,000 HKD",
                "IELTS: a minimum overall band of 6.5 with no subtest lower than 5.5; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                "https://www.sengpp.ust.hk/programs/bdt/en/curriculum.html"));
        list.add(new School_table(
                "HKUST",
                "Master of Science in Information Technology",
                "",
                "1 year",
                "147,000 HKD",
                "IELTS: a minimum overall band of 6.5 with no subtest lower than 5.5; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                "https://www.sengpp.ust.hk/programs/it/en/curriculum.html"));
        list.add(new School_table(
                "CUHK",
                "Master of Science in Computer Science",
                "",
                "1 year",
                "160,000 HKD",
                "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                "http://www.cse.cuhk.edu.hk/en/education/courses/course-list/postgraduate-course-list"));
        list.add(new School_table(
                "CUHK",
                "Master of Science in Information Engineering",
                "",
                "1 year",
                "140,000 HKD",
                "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                "http://www.ie.cuhk.edu.hk/programmes/pg_courselist.shtml"));
        list.add(new School_table(
                "CUHK",
                "Master of Science in Information & Technology Management",
                "",
                "1 year",
                "210,000 HKD",
                "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                "https://masters.bschool.cuhk.edu.hk/programmes/mscitm/curriculum/"));
        list.add(new School_table(
                "CityU",
                "Master of Science in Computer Science",
                "",
                "1 year",
                "131,100 HKD",
                "CET6 450 or\n" +
                        "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                "https://www.cs.cityu.edu.hk/courses/mscs.html"));
        list.add(new School_table(
                "CityU",
                "Master of Science in Multimedia Information Technology",
                "",
                "1 year",
                "151,500 HKD",
                "CET6 450 or\n" +
                        "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                "http://www.ee.cityu.edu.hk/home/programmes_MScMIT_Curriculum.html#CourseList"));
        list.add(new School_table(
                "PolyU",
                "Master of Science in Information Technology",
                "",
                "1.5 year",
                "132,000 HKD",
                "IELTS: a minimum overall band of 6.0; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                "https://www.comp.polyu.edu.hk/en-us/prospective-students/taught-postgraduate-programmes"));
        list.add(new School_table(
                "PolyU",
                "Master of Science in Multimedia and Entertainment Technology",
                "",
                "1 year",
                "151,200 HKD",
                "IELTS: a minimum overall band of 6.0; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                "http://www.sd.polyu.edu.hk/en/study-detail/multimedia-and-entertainment-technology"));

        table.setData(list); //传入数据
        //设置表格样式
        table.getConfig().setContentStyle(new FontStyle(40, Color.BLUE));//文字样式
        table.getConfig().setColumnTitleStyle(new FontStyle(50, Color.YELLOW));//列名
        table.getConfig().setTableTitleStyle(new FontStyle(60, Color.rgb(242,156,56)));//表名
        //不显示行号和列号；
        table.getConfig().setShowXSequence(false);
        table.getConfig().setShowYSequence(false);
        table.setBackgroundColor(Color.LTGRAY);

        table.getConfig().setSequenceVerticalPadding(4);
        table.getConfig().setSequenceHorizontalPadding(4);

    }
}
