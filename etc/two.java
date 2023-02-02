package etc;
public class two {
    public static void main(String [] agrs) {
        String s = "3people unFollowed me";
        
        String answer = "";
        String[] sp = s.split(" "); // 공백을 기준으로 문자열 자르기
        
        // 공백을 기준으로 잘려진 문자열의 수만큼 반복
        for(int i = 0; i < sp.length; i++){
            if(sp[i].length() == 0) answer += " "; // 단어가 공백일 경우 반환값에 공백 더하기
            else{
                answer += sp[i].substring(0, 1).toUpperCase(); // 단어 첫번째 대문자로 변환하여 더하기
                answer += sp[i].substring(1, sp[i].length()).toLowerCase(); // 첫글자를 제외하고 소문자로 변환하여 더하기
                answer += " "; // 띄어쓰기
            }
            
        }

        if(s.substring(s.length() -1, s.length()).equals(" "))  System.out.println(answer); // 맨 뒤 글자가 공백인 경우
        

        System.out.println(answer.substring(0, answer.length() - 1));// 일반 적인 경우 위에서 answer += " "; // 띄어쓰기로 인해 마지막에 공백이 하나 더 나옴
        
    }
}
