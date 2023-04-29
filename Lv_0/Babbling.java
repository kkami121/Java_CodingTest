package Lv_0;
// 프로그래머스 LV_0 옹알이
public class Babbling {
    public static void main(String[] args){
        int answer = 0;
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        String[] originalbabblingList = {"aya", "ye", "woo", "ma"};
        String[] repeatbabblingList = {"ayaaya", "yeye", "woowoo", "mama"};

        for(String bab : babbling){ // 자바에서 :는 in과 같은 역할로 bab에 babbling을 하나씩 넣음
            for(String rbab : repeatbabblingList){ //조카가 낼 수 있는 발음은 한 번씩만 등장한다고 했으므로 반복되는 발음은 카운트 하지 않기 위해 예외처리
                bab = bab.replace(rbab, "x");
                
            }
            for(String obab : originalbabblingList){
                bab = bab.replace(obab, "?");
            }
            System.out.println(bab);
            
            //공백으로 치환할 경우 "wyeoo" 등 중간에 발음이 들어가는 경우 ye가 공백으로 치환되면서 woo도 공백으로 치환
            //이러한 문제점을 해결하기 위해 ?으로 치환 후 모든 문자가 ?로 치환되는 경우 answer을 count해야함
            int check = 0;
        
            for(int i = 0; i < bab.length(); i++){
                if(!bab.substring(i, i + 1).equals("?")){// 모든 문자가 ?로 치환되지 않는 경우를 check
                    check = 1;
                    break;
                }
            }
            if(check == 0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}

/*
Tip
1. for(a : b)를 통해 in처럼 a에 b를 하나씩 담을 수 있다
2. s.replace("a", "b")를 통해 문자열 s안에서 "a"를 "b"로 치환
3. s.subSequence(index, index)는 인덱스 사이 값을 반환한다. substring을 사용해도 된다.
*/