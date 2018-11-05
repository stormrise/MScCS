package hk.hku.cs.msccs;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;

@SmartTable(name = "Course Information")
public class Course_table {
    public Course_table(String stream, String Name){
        this.Stream=stream;
        this.Courselist=Name;
    }

    @SmartColumn(id=0,name ="Stream",autoMerge = true)
    private String Stream;

    @SmartColumn(id=1,name="Course List")
    private String Courselist;
}
