package Lv_0;
// 프로그래머스 Lv_0 문자열안에 문자열
public class StringInString {
    public static void main(String[] args){
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        int result = 2;
        
        for(int i = 0; i < str1.length(); i++){

            if(str1.length() < str2.length()){ // str2의 길이가 str1보다 큰 경우 런타임 에러가 나기 때문에 예외처리
                break;
            }
            if(str2.equals(str1.substring(i, (str2.length() + i)))){ //str1 0인덱스부터 str2의 길이만큼 반환 후 비교
                result = 1;
                break;
            }
            if((str2.length() + i) == str1.length()){ //끝 인덱스의 길이가 str1에 도달하면 break
                break;
            }
        }
        System.out.println(result);
    }
}
/*
Tip
1. str1.contains(str2) 함수를 통해 문자열 포함 여부를 쉽게 확인할 수 있다.
 */