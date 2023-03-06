package Lv_0;
// 프로그래머스 Lv_0 한 번만 등장한 문자
import java.util.Arrays;
public class OnlyOnceString {
    public static void main(String[] args){
        String s = "abcdabcabc";

        String[] s_char = s.split("");
        String answer = "";
        for(int i = 0; i < s.length(); i++){ // 비교할 기준이 되는 문자 반복

            int count = 0; // 1번만 나오는 문자를 구분하기 위한 count

            for(int j = 0; j < s.length(); j++){ // 비교할 문자 반복
                if(s_char[i].equals(s_char[j])){ // 기준이 되는 문자와 비교할 문자가 같은 경우 count
                    count++;
                }
            }
            if(count == 1){
                answer += s_char[i];
            }            
        }
        char[] string_to_Char = answer.toCharArray(); // char 배열에 넣게
        Arrays.sort(string_to_Char); // 정렬
        String sorted_answer = new String(string_to_Char); // 다시 String으로
        System.out.println(sorted_answer);
    }
}
// 다른 풀이
/*
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
}
 */