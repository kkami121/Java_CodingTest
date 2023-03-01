package Lv_0;
// 프로그래머스 Lv_0 가장 큰 수 찾기
import java.util.Arrays; // 배열 가로 출력울 위해 사용
public class LargestNumber {
    public static void main(String[] args){
        int[] array = {1, 8, 3};

        int[] answer = new int[2];
        int max_num = array[0];;
        int max_index = 0;
        for(int i = 1; i < array.length; i++){
            if(max_num < array[i]){
                max_num = array[i];
                max_index = i;
            }
        }
        answer[0] = max_num;
        answer[1] = max_index;

        System.out.println(Arrays.toString(answer)); // 배열을 가로로 출력
    } 
}
