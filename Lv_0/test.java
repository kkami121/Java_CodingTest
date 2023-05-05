// 배열리스트 연습 
// 정수형으로 사용하는법
// 문자열은 어떻게 사용하는지
// 출력할 때 배열로 다시 변환해야 하는데
// 일반 system출력은 리스트로 가능 하지만 함수에서 return할 때는 다시 배열로 해야함


package Lv_0;
import java.util.*;
public class test {
    public static void main(String[] args){
        String my_string = "people";
        
        System.out.println(my_string.substring(1, 2));
        
    }
}


/*
import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        List<String> answer = new ArrayList<>();
        String str = "";
        for(int i=0; i<my_str.length(); i++){
            str += my_str.charAt(i);
            if(str.length() == n || i == my_str.length()-1){
                answer.add(str);
                str = "";
            }
        }

        return answer.stream().map(s -> s).toArray(String[]::new); // 문자열 배열로 반환
    }
}
 */