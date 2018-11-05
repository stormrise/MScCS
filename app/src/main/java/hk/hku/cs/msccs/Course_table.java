package hk.hku.cs.msccs;

import android.graphics.Paint;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;

@SmartTable(name = "Course Information")
public class Course_table {
    public Course_table(String Stream, String Courselist){
        this.Stream=Stream;
        this.Courselist=Courselist;
    }

    @SmartColumn(id=0,name ="Stream",autoMerge = true)
    private String Stream;

    @SmartColumn(id=1,name="Course List",align=Paint.Align.LEFT)
    private String Courselist;
}
