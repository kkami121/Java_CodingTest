// 프로그래머스 Lv_0 종이 자르기 
public class PaperCut {
    public static void main(String[] args){
        int m = 2;
        int n = 5;

        int answer = 0;
        answer = (m - 1) + m * (n - 1);
        System.out.println(answer);
    }   
}
/*
Tip
1. m - 1 만큼 자르기 ex) m = 3일 때 m - 1번 짜르면 3개의 m이 1인 값
2. n - 1 만큼 자르기 ex) n = 5일 때 n - 1번 자르면 5개의 n이 1인 값
3. n - 1 에서 m을 곱해주면 길이가 m과 n이 1인 종이가 나옴
4. 총 자른 횟수를 return 해야 하기 때문에 (m - 1) + m * (n - 1)으로 공식화
 */