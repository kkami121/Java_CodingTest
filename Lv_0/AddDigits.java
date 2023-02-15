package Lv_0;
// 프로그래머스 Lv_0 자릿수 더하기
public class AddDigits {
    public static void main(String[] args){
        int n = 1234;

        int length =  (int)(Math.log10(n)+1); // 정수의 길이
        int answer = 0;
        
        for(int i  = 0; i < length; i++){
            answer += (n % 10); // 일의 자리 구하기
            n /= 10; // 일의 자리 제외 값 구하기
        }
        System.out.println(answer);
    }
}
/*
Tip
1. (int)( Math.log10(n)+1)을 통해 주어진 정수의 길이를 구할 수 있다.
2. 나머지 연산인 n % 10을 통해 일의 자리를 얻을 수 있다.
3. 나누기 연산인 n / 10을 통해 일의 자리를 제외한 값을 구할 수 있다.
 */


// 다른 풀이(정수 길이 없이 while문으로)
// public class AddDigits{
//     public static void main(String[] args){
//         int n = 1234;
//         int answer = 0;
        
//         while(n>0){
//             answer += n % 10;
//             n /= 10;
//         }
//         System.out.println(answer);
//     }
// }


// 다른 풀이(stream으로)
// import java.util.Arrays;
// public class AddDigits{
//     public static void main(String[] args){
//         int n = 1234;
        
//         System.out.println(Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum());
//     }
// }

