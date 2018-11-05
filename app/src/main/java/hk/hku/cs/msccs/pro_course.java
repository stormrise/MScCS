package hk.hku.cs.msccs;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;
import com.bin.david.form.core.TableConfig;
import com.bin.david.form.data.column.Column;
import com.bin.david.form.data.style.FontStyle;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class pro_course extends AppCompatActivity {
    private static ImageView course;
    private  SmartTable table;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_course);
        course =(ImageView)findViewById(R.id.course_img);
        Glide.with(course.getContext())
                .load("https://www.msc-cs.hku.hk/Media/Default/ContentImages/Curriculum.jpg")
                .into(course);
        //table=(SmartTable) findViewById(R.id.table);
        List<Course_table> list=new ArrayList<>();
        list.add(new Course_table("Cyber Security", "COMP7806  Topic in information security"));
        list.add(new Course_table("Cyber Security", "COMP7901  Legal protection of digital property #"));
        list.add(new Course_table("Cyber Security", "COMP7903  Digital investigation and forensics"));
        list.add(new Course_table("Cyber Security", "COMP7904  Information security: attacks and defense"));
        list.add(new Course_table("Financial Computing", "COMP7103  Data Mining"));
        list.add(new Course_table("Financial Computing", "COMP7405  Techniques in computational finance"));
        list.add(new Course_table("Financial Computing", "COMP7406  Software development for quantitative finance"));
        list.add(new Course_table("Financial Computing", "COMP7407  Securities transaction banking"));

        //table.setData(list);

        //table.getConfig().setContentStyle(new FontStyle(50, Color.BLUE));





    }
}
