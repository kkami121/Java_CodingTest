package Lv_0;
// 프로그래머스 Lv_0 배열의 유사도
public class ArraySimilarity {
    public static void main(String[] agrs){

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        int count = 0;

        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}



/*
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> list1 = Arrays.asList(s1);
        List<String> list2 = Arrays.asList(s2);

        list1 = list1.stream().filter(one -> list2.stream().filter(
            two -> two.contentEquals(one)
        ).findAny().isPresent()).collect(Collectors.toList());

        return list1.size();
    }
}
*/

/*
import java.util.HashSet;
import java.util.List;
class Solution {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>(List.of(s1));
        for (String s : s2) {
            if(set.contains(s)){
                answer++;
            }
        }
        return answer;
    }
}
 */