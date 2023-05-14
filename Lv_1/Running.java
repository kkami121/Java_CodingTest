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
            rank.put(i + 1, players[i]); // 순위 , 이름 hashmap
            player.put(players[i], i + 1); // 이름, 순위 hashmap
        }

        for (String curPlayer : callings) {
            int curRank = player.get(curPlayer); // 현재 플레이어의 순위
            int frontRank = curRank - 1;         // 앞 플레이어의 순위
            String frontPlayer = rank.get(frontRank); //앞 플레이어 이름

            rank.put(frontRank, curPlayer); // 추월할 선수 이름 앞으로
            rank.put(curRank, frontPlayer); // 추월 당한 선수 뒤로
            System.out.println(rank);
            player.put(frontPlayer, curRank); // 추월 당한 선수 순위 다운
            player.put(curPlayer, frontRank); // 추월한 선수 순위 업
        }

        String[] answer = new String[players.length];
        int cnt = 0;
        for(String s : rank.values()){
            answer[cnt++] = s;
        }
        
    }
}
