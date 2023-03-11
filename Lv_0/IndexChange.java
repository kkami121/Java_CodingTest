package Lv_0;
// 프로그래머스 Lv_0 인덱스 바꾸기
public class IndexChange {
    public static void main(String[] args){
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        StringBuilder sb = new StringBuilder(my_string);

        sb.setCharAt(num1, my_string.charAt(num2)); // setCharAt(인덱스, 변경할 값)
        sb.setCharAt(num2, my_string.charAt(num1)); // 해당 인덱스의 값을 변경하는 메소드

        String answer = sb.toString();
        System.out.println(answer);       
    }
}

// 다른 풀이
/*
public class IndexChange {
    public static void main(String[] args){
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        // String answer = my_string;
            // substring으로 바꾸고 싶은 문자열 앞 + 바꿀 문자열 + 바꾼 문자열 뒤을 2번 반복해서 구하기
        // answer = answer.substring(0, num1) + my_string.charAt(num2) + answer.substring(num1 + 1);
        // answer = answer.substring(0, num2) + my_string.charAt(num1) + answer.substring(num2 + 1);
        // System.out.println(answer);  
    }
}
 */

 // 자바 문자열의 특정 인덱스에 있는 문자 바꾸기 참고 자료
 // https://www.techiedelight.com/ko/replace-character-specific-index-java-string/