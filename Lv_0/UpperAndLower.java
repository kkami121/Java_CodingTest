package Lv_0;
// 프로그래머스 Lv_0 대문자와 소문자
public class UpperAndLower {
    public static void main(String[] args){
        String my_string = "cccCCC";

        char[] my_string_char = my_string.toCharArray();

        for(int i = 0; i < my_string_char.length; i++){
            if(Character.isUpperCase(my_string_char[i])){
                my_string_char[i] = Character.toLowerCase(my_string_char[i]);
            }
            else{
                my_string_char[i] = Character.toUpperCase(my_string_char[i]);
            }
        }
        String answer = new String(my_string_char);

        System.out.println(answer);
    }
}
// string을 string 배열로
// string을 char 배열로
// char배열을 string으로

// string 일 때 대소문자 변환
// char 일 때 대소문자 변환