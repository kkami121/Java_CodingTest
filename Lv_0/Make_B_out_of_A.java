package Lv_0;

import java.util.Arrays;

public class Make_B_out_of_A {
    public static void main(String args[]){
        String before = "olleh";
        String after = "hello";

        char[] beforC = before.toCharArray();
        char[] afterC = after.toCharArray();

        Arrays.sort(beforC);
        Arrays.sort(afterC);

        before = new String(beforC);
        after = new String(afterC);

        if(before.equals(after)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
