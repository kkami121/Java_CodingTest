package Lv_0;
// 프로그래머스 Lv_0 n의 배수 고르기
public class PickOfMultiple_n{
    public static void main(String[] args){
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        int[] arry = new int[numlist.length];
        int answer_length = 0; // n의 배수 담을 배열의 크기 설정을 위한 변수
        
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){ // number % n == 0을 이용해서 배수 반환
                arry[answer_length] = numlist[i];
                answer_length++;
            }
        }

        int[] answer = new int[answer_length]; // n의 배수만 담기 위한 배열 선언

        for(int i = 0; i < answer_length; i++){
            answer[i] = arry[i];
            System.out.println(answer[i]);
        }
    }
}