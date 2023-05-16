package Lv_1;
// 프로그래머스 Lv_1 달리기 경주
// 해쉬맵 이용
import java.util.*;
public class Running{
    public static void main(String[] args){
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        Map<Integer, String> rank = new HashMap<>();
        Map<String, Integer> player = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            rank.put(i , players[i]); // 순위 , 이름 hashmap
            player.put(players[i], i ); // 이름, 순위 hashmap
        }

        for (String curPlayer : callings) {
            int curRank = player.get(curPlayer); // 현재 플레이어의 순위
            int frontRank = curRank - 1;         // 앞 플레이어의 순위
            String frontPlayer = rank.get(frontRank); //앞 플레이어 이름

            rank.put(frontRank, curPlayer); // 추월할 선수 이름 앞으로
            rank.put(curRank, frontPlayer); // 추월 당한 선수 뒤로
            
            player.put(frontPlayer, curRank); // 추월 당한 선수 순위 다운
            player.put(curPlayer, frontRank); // 추월한 선수 순위 업
        }

        String[] answer = new String[players.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = rank.get(i);
            System.out.println(answer[i]);
        }
    }
}
// 다른풀이
// 해쉬맵을 통해 인덱스만 가져오고 주어진 배열에 인덱스를 통해서 이름(String)을 가져오고 put
// 임시값 temp을 통해서 change

// import java.util.*;
// class Solution {
//     public String[] solution(String[] players, String[] callings) {
//         Map<String, Integer> pMap = new HashMap<String, Integer>();
        
//         for(int i = 0; i < players.length; i++){
//             pMap.put(players[i], i);
//         }
        
//         for(String name : callings){
//             //change ranks
//             int idx = pMap.get(name);
//             pMap.put(players[idx], idx - 1);
//             pMap.put(players[idx - 1], pMap.get(players[idx - 1]) + 1);
//             //swap players
//             String temp = players[idx];
//             players[idx] = players[idx - 1];
//             players[idx - 1] = temp;
//         }
        
//         return players;
//     }
// }
