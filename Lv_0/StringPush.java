package Lv_0;
// 프로그래머스 Lv_0 문자열 밀기
public class StringPush {
    public static void main(String[] args){

        String A = "apple";
        String B = "elppa";
        String temp = ""; // 변경 전 문자열을 담을 변수 초기화
        int count = 0;

        if(A.equals(B)){ // A와 B가 같은 경우을 대비해서 미리 검사
            System.out.println(count); 
        }
        else{ // A와 B가 다른 경우
            for(int i = 0; i < A.length(); i++){
                
                temp = A;

                A = A.substring(A.length() - 1) + temp; // A의 마지막 문자를 반환하여 기존 A를 넣은 temp를 더해 마지막 문자가 맨앞으로 오도록
                A = A.substring(0, A.length() - 1); // 0부터 마지막 문자를 제외한 값을 반환
                
                count++;

                if(A.equals(B)){ // 문자열 밀기 후 A와 B가 같은 경우
                    System.out.println(count);
                    break; 
                }
                else if(count == A.length()){ // count가 문자열 길이와 같은 경우는 문자열 밀기가 끝난 후 A와 B가 다른 경우
                    count = -1;
                    System.out.println(count); 
                }
            }   
        }
    }
}
/*
Tip
1. .substring(index)을 통해 문자열의 해당 인덱스 값을 반환할 수 있다.
2. .substring(0, index)을 통해서 0부터 index까지 문자열을 반환할 수 있다.

번외1. 문자열 자체의 인덱스는 .charAt(index)를 통해서 반환받을 수 있다.

&&&전체적인 코드를 쉽게 이해할 수 있도록 최대한 풀어서 작성 중입니다.&&&
&&&더 간결하게 줄일 수 있는 부분이 충분히 있으니 도전해보시는 것도 좋을 거 같습니다.&&&
 */

// 다른 풀이
/*public static void main(String[] args){
    String A = "hello";
    String B = "lohel";

    String tempB = B.repeat(3);  // 3번 반복
                                       // ex) B = "lohel"일 경우 tempB = "lohellohellohel"
    tempB.indexOf(A); // lohel lohel lohel 중 A가 해당되기 시작하는 인덱스 반환
                      // 시작할 위치는 0을 반환
                      // 없는 경우 -1을 반환
                      // ex)  012 
                      //        hello
                      //      lohellohelohel
                      // 2인덱스에서 시작함으로 2를 반환
    System.out.println(tempB.indexOf(A));
}
*/
