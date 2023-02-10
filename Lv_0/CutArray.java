package Lv_0;
// 프로그래머스 Lv_0 잘라서 배열로 저장하기
public class CutArray {
    public static void main(String[] args){
        String str = "abc1Addfggg4556b";
        int n = 6;

        String temp = ""; // 문자열을 자르기 위한 변수
        String[] answer = new String [(int)Math.ceil((float)str.length()/n)]; //(str.length() + n - 1) / n도 가능
        // 문자열 배열의 크기를 지정할 경우 나누어 떨어지는 경우와 나누어 떨어지지 않는 경우 생각해야한다.
        // ex) str.length가 18이고 n이 6인경우 answer의 크기는 3
        //     str.length가 16이고 n이 6인경우 answer의 크기는 2가 되지만 필요한 크기는 3이기 때문
        //     float를 통해 소수점으로 표현하고 Math.ceil을 통해 올림

        for(int i = 0; i < answer.length; i++){
            temp = str.substring((n * i), str.length());
            // 고정된 str 길이를 통해 문자열을 잘라 temp에 넣기
            // ex "abc1Addfggg4556b", "dfggg4556b", "556b"    
            if(temp.length() >= n){ // temp의 길이가 6이상인 경우
                answer[i] = temp.substring(0, n); // 0부터 n까지 잘린 문자열 넣기
                System.out.println(answer[i]);
            }
            else{// "556b"의 길이는 4인데 n인 6까지 넣으려고 하면 에러가 나기 때문에 temp길이가 n보다 작은 경우
                answer[i] = temp; //n보다 작고 마지막으로 잘린 남은 문자열 넣기
                System.out.println(answer[i]);
            }
        } 
        // Tip. 잘린 문자열을 저장할 변수 temp없이 str만 이용하려고 한다면 
        //      str.substring((n * i), str.length())에서 앞 인덱스 값은 증가하고 뒤의 str의 길이는 작아지며 에러 발생


        /*다른 풀이
        for(int i = 0; i < answer.length; i++){
            answer[i] = str.substring(n * i, (n * i) + n >= str.length()? str.length(): (n * i) + n); // 삼항연산자 사용
            System.out.println(answer[i]);
        }*/
    }      
}