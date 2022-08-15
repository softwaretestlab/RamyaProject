package JavaOOPSconcepts;

import org.junit.Test;

public class AT07_InHeritance03 {

    @Test
    public void inhMethod05(){
        AT06_InHeritance02 obj = new AT06_InHeritance02();
        obj.inhMethod01();
        obj.inhMethod02();
        obj.inhMethod03();
        obj.inhMethod04();
    }
    @Test
    public void inhMethod06(){
        //here we are directly calling method in parent
        AT05_InHeritance01 obj = new AT05_InHeritance01();
        obj.inhMethod03();
    }
}
