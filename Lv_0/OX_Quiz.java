package Lv_0;
// 프로그래머스 Lv_0 OX퀴즈
public class OX_Quiz {
    public static void main(String[] args){
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        
        
        String[] answer = new String[quiz.length]; // 결과를 리턴해줄 배열 크기 선언
        String[] temp = {}; // 띄어쓰기를 기준으로 나눈 문자열을 저장할 배열

        for(int i = 0; i < answer.length; i++){

            temp = quiz[i].split(" "); // 띄어쓰기를 기준으로 나눈 값
            int num1 = Integer.parseInt(temp[0]); // 연산할 첫 번째 숫자
            int num2 = Integer.parseInt(temp[2]); // 연산할 두 번째 숫자
            int calculate = Integer.parseInt(temp[4]); // 연산 완료된 값
            int result = 0;
            
            switch(temp[1]){
                case "+" :
                    result = num1 + num2;
                    break;
                case "-" :
                    result = num1 - num2;
            }
            if(result == calculate){
                answer[i] = "O";
            }
            else{
                answer[i] = "X";
            }
            System.out.println(answer[i]);
        }
    } 
}
/*
Tip
1. str.split(" ")을 통해서 문자열을 나누어 저장할 수 있다.(String[] answer = str.split(" ")식으로 배열로 받아야함)
 */
