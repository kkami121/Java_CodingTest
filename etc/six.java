package etc;
import java.util.*;

public class six {
    public static void main(String [] agrs) {
        int n = 3;
        
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
       
        int[] answer = new int[2];
        
        int peopleCount = 0;
        int gameCount = 1;
        String prev = "";

        Map<String, Integer> map = new HashMap<>();
         
        for(int i = 0; i < words.length; i++){
            String now = words[i];
            peopleCount++;
            
            
           
            if(i > 0){
                //끝말 확인, 이미 존재하는 단어인지 확인
                char prevChar = prev.charAt(prev.length()-1);
                char nowChar = now.charAt(0);
                if(prevChar != nowChar || map.containsKey(now)){
                    answer[0] = peopleCount;
                    answer[1] = gameCount; 
                    break;
                }
                
            }

            map.put(now, 0);
            prev = now; // i = 0 일 때 tank가 들어감

            if(peopleCount == n){
                peopleCount = 0;
                gameCount++;
            }
            System.out.println(gameCount);

        }

        // System.out.println(answer[0] + " "  + answer[1]);
    
       
    }
}
