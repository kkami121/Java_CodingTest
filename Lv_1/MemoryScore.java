package Lv_1;
// 프로그래머스 Lv_1 추억 점수
import java.util.*;
public class MemoryScore {
    public static void main(String[] args){
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
            {"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}
        };
        
        int[] answer = new int[photo.length];
        
        HashMap<String,Integer> map = new LinkedHashMap<>();
        
        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]); // 추억하는 사람 이름에 점수 저장
        }

        for(int i=0; i< photo.length; i++){
            String[] persons = photo[i]; // 그룹별 배열 생성
            int score = 0;
            
            for(int j=0; j<persons.length; j++){
            	
                String person = persons[j];
                if(map.containsKey(person)){ // map의 key에 photo 속 사람이 있다면
                    score+=map.get(person); // 점수 추가
                }
            }
            answer[i]=score;
            System.out.println(answer[i]);
        }
    }
}
