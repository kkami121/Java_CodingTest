package Lv_0;
// 프로그래머스 Lv_0 369게임
public class Game369 {
    public static void main(String[] args){
        int order = 29423;
        int result = 0;

        while(order > 0){
            int n = order % 10; // 일의 자리 구해서 
            if(n == 3 || n == 6 || n ==9){ // 3,6,9와 비교
                result++;
            }
            order /= 10; // 비교를 완료한 일의 자리는 제거
        }
        System.out.println(result);
    }
}
// 프로그래머스 Lv_0 자릿수 더하기와 비슷한 문제
