package LoopsNConditionalStatments;

import org.junit.Test;

public class AT06_SwitchStatement {
    @Test
    public void SwitchStatmentLearn() {
        switch(10){
            case 1:
                System.out.println("1 is selected");
                break;
            case 2:
                System.out.println("2 is selected");
            case 3:
                System.out.println("3 is selected");
            case 4:
                System.out.println("4 is selected");
            default:
                System.out.println("none selected");
        }

    }
}
