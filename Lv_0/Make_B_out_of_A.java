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
/*
Tip 
하나씩 문자열을 밀어서 같은지 판단하는 경우 프로그래머스 Lv_0 문자열 밀기 참조..
순서만 바꿔서 문자열이 같은지 판단하는 경우 정렬을 사용하면 편하다...
 */