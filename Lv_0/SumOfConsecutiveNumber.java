package Lv_0;
// 프로래머스 Lv_0 연속된 수의 합
public class SumOfConsecutiveNumber {
    public static void main(String[] args){
        int num = 5;
        int total = 10;

        int [] answer = new int[num];

        for(int i = -(total + num); i <= (total + num); i++){
            int index = 0;
            int sum = 0;
            for(int j = i; j < (i + num); j++){
                sum += j;
                answer[index++] = j;
            }
            if(sum == total){
                break;
            }
        }
        
        for(int i = 0; i < num; i++){
            System.out.println(answer[i]);
        }
    }
}
/*
Tip
1. answer값이 음수 일 수 있기 때문에 범위를 -(total + num)부터 설정
2. 현재 i에서 1씩 늘어나면서 num 개수 만큼 sum을 구하기 위해서 (i + num)으로 범위 설정
3. index와 sum을 첫 for 안에 초기화
 */