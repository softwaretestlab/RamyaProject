package JavaOOPSconcepts;

import org.junit.Test;

public class AT09_Polymorphism_MethodOverLoading02 {
    @Test
    public void callPoly(){
        AT08_Polymorphism_MethodOverLoading01 obj = new AT08_Polymorphism_MethodOverLoading01();
        obj.SumOfNum();
        obj.SumOfNum(90);
        obj.SumOfNum(190,240);
    }
}
