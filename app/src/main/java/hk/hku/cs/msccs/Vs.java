package hk.hku.cs.msccs;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;
import com.bin.david.form.data.style.FontStyle;

import java.util.ArrayList;
import java.util.List;

public class Vs extends AppCompatActivity {

    @SmartTable(name = "VS Information")
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

        @SmartColumn(id=1,name ="School",autoMerge = true)
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
                ""));
        list.add(new School_table(
                "HKUST",
                "Master of Science in Big Data Technology",
                "",
                "1 year",
                "210,000 HKD",
                "IELTS: a minimum overall band of 6.5 with no subtest lower than 5.5; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "HKUST",
                "Master of Science in Information Technology",
                "",
                "1 year",
                "147,000 HKD",
                "IELTS: a minimum overall band of 6.5 with no subtest lower than 5.5; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "CUHK",
                "Master of Science in Computer Science",
                "",
                "1 year",
                "160,000 HKD",
                "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "CUHK",
                "Master of Science in Information Engineering",
                "",
                "1 year",
                "140,000 HKD",
                "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "CUHK",
                "Master of Science in Information & Technology Management",
                "",
                "1 year",
                "210,000 HKD",
                "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "CityU",
                "Master of Science in Computer Science",
                "",
                "1 year",
                "131,100 HKD",
                "CET6 450 or\n" +
                        "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "CityU",
                "Master of Science in Multimedia Information Technology",
                "",
                "1 year",
                "151,500 HKD",
                "CET6 450 or\n" +
                        "IELTS: a minimum overall band of 6.5; or\n" +
                        "TOEFL: a score of 79 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "PolyU",
                "Master of Science in Information Technology",
                "",
                "1.5 year",
                "132,000 HKD",
                "IELTS: a minimum overall band of 6.0; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                ""));
        list.add(new School_table(
                "PolyU",
                "Master of Science in Multimedia and Entertainment Technology",
                "",
                "1 year",
                "151,200 HKD",
                "IELTS: a minimum overall band of 6.0; or\n" +
                        "TOEFL: a score of 80 or above (internet-based test).",
                ""));

        table.setData(list); //传入数据
        //设置表格样式
        table.getConfig().setContentStyle(new FontStyle(40, Color.BLUE));//文字样式
        table.getConfig().setColumnTitleStyle(new FontStyle(50, Color.YELLOW));//列名
        table.getConfig().setTableTitleStyle(new FontStyle(60, Color.YELLOW));//表名
        //不显示行号和列号；
        table.getConfig().setShowXSequence(false);
        table.getConfig().setShowYSequence(true);
        table.setBackgroundColor(Color.LTGRAY);
    }
}
