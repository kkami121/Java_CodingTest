package Lv_0;
// 프로그래머스 Lv_0 중복된 문자 제거
public class RemoveDuplicate{
    public static void main(String[] args){
        String my_string = "people";
        String answer = "";

        for(char c : my_string.toCharArray()){ // my_string을 char로 만들면서 반복문
            if(answer.indexOf(String.valueOf(c)) == -1){ // 추가할 answer에 c가 없으면
                answer += c; // 추가
                // indexOf는 해당 문자열이 포함되어 있으면 해당 인덱스를 반환 없으면 -1을 반환하기 때문에 중복을 체크할 수 있다.
                // String.valueOf를 통해 char형태의 c를 String으로(answer가 String이기 때문에 indexOf을 하기 위해서는 같은 형태여야함)
            }
        }
        System.out.println(answer);
    }
}

// 다른 풀이
/*
    for(int i = 0; i < my_string.length(); i++){
        if(my_string.indexOf(my_string.charAt(i)) == i){
            answer += my_string.charAt(i);
            // indexOf은 전체 문자열에서 해당 문자가 포함되어 있으면 제일 해당 문자가 있는 인덱스를 반환하는데
            // 가장 앞에 있는 인덱스만 반환한다.
            // ex) people 일 때 p의 인덱스는 0과 3에 있지만 3에 있는 p의 인덱스 또한 0으로 반환한다.
            // 따라서 y_string.indexOf(my_string.charAt(i)) == i에서 i와 해당 인덱스만 해당하는 경우만 answer에 추가하면 중복을 제거할 수 있다.
        }
    }
 */