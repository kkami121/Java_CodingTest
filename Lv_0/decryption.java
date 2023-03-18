package Lv_0;
// 프로그래머스 Lv_0 암호해독
public class decryption {
    public static void main(String[] args){
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        String answer = "";
        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }
        /*
        for(int i = code - 1; i <= cipher.length(); i+=code){
            answer += cipher.charAt(i); // 프로그래머스에서 런타임 에러가 남;;;;
        }
         */
        System.out.println(answer);
    }    
}
/*
Tip
1. substring(index, index)은 인덱스에 포함된 문자열을 반환
2. charAt(index)은 인덱스에 해당하는 문자를 반환
 */
