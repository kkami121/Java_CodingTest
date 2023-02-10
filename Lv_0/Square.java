package Lv_0;
// 프로그래머스 Lv_0 제곱수 판별하기
public class Square {
    public static void main(String[] args){
        int n = 144;

        int answer = (int)Math.sqrt(n);

        if(Math.pow(answer, 2) == n){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
    }
}
/*
Tip
1. Math.pow 제곱
2. Math.sqrt 제곱근
 */