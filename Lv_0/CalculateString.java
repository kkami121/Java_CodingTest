package Lv_0;
// 프로그래머스 Lv_0 문자열 계산하기
public class CalculateString {
    public static void main(String[] args){
        
        String str = "3 + 4 - 1";
        String[] my_str = str.split(" "); // split으로 문자열 나누기
        int answer = Integer.parseInt(my_str[0]); // 첫 정수값으로 초기화
        
        for(int i = 1; i < my_str.length; i++){
            // "+", "-"을 구분해서 계산하기
            if(my_str[i].equals("+")){
                answer += Integer.parseInt(my_str[i + 1]); // Integer.parseInt로 문자열을 정수형으로 변환
            }
            if(my_str[i].equals("-")){
                answer -= Integer.parseInt(my_str[i + 1]); //
            }
        }
        System.out.println(answer);
    }
}


/* 다른풀이
import java.util.Arrays;

class Solution {
    public int solution(String myString) {
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }
}
 */