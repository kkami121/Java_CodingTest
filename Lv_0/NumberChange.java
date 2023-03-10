package Lv_0;
// 프로그래머스 Lv_0 영어가 싫어요
public class NumberChange {
    public static void main(String[] args){
        String numbers = "onetwothreefourfivesixseveneightnine";

        long answer = 0;
        
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");

        answer = Long.parseLong(numbers); // 문자열을 long으로 변환

        System.out.println(answer);
    }
}
/*
Tip
1. int num = Integer.parseInt(string); 으로 문자열을 정수형으로 변환할 수 있다.
 */
