package Lv_0;
// 프로그래머스 Lv_0 다음에 올 숫자
public class NextNumber {
    public static void main(String [] args){

        int [] common = {-5, 10, -20};
        int answer = 0;

        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[common.length - 1] + (common[1] - common[0]);
        }
        else{
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        System.out.println(answer);
    }
}
/*
Tip
1. 인덱스 1과 0의 차이와 인덱스 2와 1의 차이가 같다면 등차수열 / 다르다면 등비수열!!
2. common[common.length - 1]을 통해 마지막 인덱스 값을 가져올 수 있다.
3. 공차는 인덱스의 차이로 구할 수 있다. / 공비는 인덱스의 나누기로 구할 수 있다.
4. 등차수열인 경우 마지막 인덱스와 공차인 값을 더해주고 / 등비수열인 경우 마지막 인덱스와 공비의 값을 곱해준다.
 */ 