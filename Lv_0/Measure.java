package Lv_0;
// 프로그래머스 Lv_0 약수 구하기
import java.util.ArrayList;
public class Measure {
    public static void main(String[] args){
        int n = 24;

        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer.add(i);
            }
        }
        System.out.println(answer.stream().mapToInt(x -> x).toArray());// int 배열로 변환
        // answer.stream().map(s -> s).toArray(String[]::new); // 문자열 배열로 반환
    }
}
/*
class Solution {
    public int[] solution(int n) {
        int[] arry = new int[10000];
        int index =0;
       
        for(int i = 1; i<=n; i++) {
			if(n%i ==0) {
				arry[index] = i;
				index++; // 인덱스라는 값을 count해서 최종 배열의 크기를 결정
			}
		}
		int[] answer = new int [index];
		for(int i = 0; i<index; i++) {
			if(arry[i] != 0) {
				answer[i] = arry[i];

			}
		}
        return answer;
    }
}
 */