package Lv_0;
// 프로그래머스 Lv_0 숫자 찾기
public class FindNumber {
    public static void main(String[] args){
        int num = 29183;
        int k = 3;

        int length = (int)(Math.log10(num)+1); // 정수형 길이
        int[] answer = new int[length]; // 숫자를 찾기 위한 배열 선언
        int result = 0; // 결과값 찾으면 위치 번호, 찾지 못하면 -1 리턴

        for(int i = length - 1; i >= 0; i--){ // 일의 자리부터 배열에 담기
            answer[i] = num % 10; // 일의 자리 반환
            num /= 10;
        }
        for(int i = 0; i < length; i++){
            if(answer[i] == k){
                result = i + 1;
                break;
            }
            else{
                result = -1;
            }
        }
        System.out.println(result);
    }
}
// 다른풀이 
// public class FindNumber {
//     public static void main(String[] args){

//         int num = 29183;
//         int k = 1;

//         System.out.println(("0" + num).indexOf(String.valueOf(k)));
//     }
// }
/*
Tip
1. String + int = String
2. String.valueOf(num)를 이용하여 정수형을 문자열로 변환
3. str.indexOf(k)를 통해 k가 해당되는 인덱스 출력
4. "0"을 더해주면서 문자열로 만들고 indexOf(k)가 0부터 시작이기 때문에 해당 문제에서 +1된 값을 리턴하기 위해 사용
*/