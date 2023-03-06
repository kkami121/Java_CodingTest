package Lv_0;
// 프로그래머스 Lv_0 문자열 정렬하기(2)
import java.util.Arrays;

public class SortString_2 {
    public static void main(String[] args){
        String my_string = "Bcad";

        my_string = my_string.toLowerCase(); // 소문자로 변경 
                                             // 대문자 변경은 my_string.toUpperCase()
        // 문자열 정렬하기
        char[] StringtoChar = my_string.toCharArray(); // char 배열에 넣게
        Arrays.sort(StringtoChar); // 정렬
        String SortedString = new String(StringtoChar); // 다시 String으로

        System.out.println(SortedString);
    }
}
