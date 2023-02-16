package Lv_0;
// 프로그래머스 Lv_0 연속된 수의 합(다른 풀이)
public class SumOfConsecutiveNumber2 {
    public static void main(String[] args){
        int num = 5;
        int total = 15;

        // 방법1
        int[] answer = new int[num];
        int temp = 0;
        for(int i=0;i<num;i++){
            temp+=i;
            System.out.println(temp);
        }       
        int value1 = (total-temp)/num;

        for(int i=0;i<num;i++){
            answer[i]=i+value1;             
        }

        // 방법2
        int[] answer2 = new int[num];
        int check = num*(num+1) / 2;
        int value2 = (total-check)/num;

        for(int i=1;i<num + 1;i++){
            answer2[i-1]=i+value2;           
        }
        
    }
}
