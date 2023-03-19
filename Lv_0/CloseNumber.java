package Lv_0;
// 프로그래머스 Lv_0 가까운 수
public class CloseNumber {
    public static void main(String[] args){ // 테스트5에서 실패...?
        int[] array = {3, 10, 28};
        int n = 20;
        int answer;

        int[] temp = new int[array.length]; // n과 가까운 수를 구하기 위해 각 배열의 정수들과의 차이를 저장하기 위한 배열

        for(int i = 0; i < array.length; i++){
            temp[i] = Math.abs(array[i] - n); // array배열의 정수와 n의 차이의 절대값을 temp에 저장
        }

        int min = temp[0]; // 가장 가까운 수를 찾기 위해서 비교된 값들 중 최소값 찾기
        int min_index = 0; // 최소값일 때 인덱스를 구해 최종 array의 인덱스를 통해 반환할 예정

        for(int i = 1; i < temp.length; i++){
            if(min > temp[i]){
                min = temp[i]; // 최소값
                min_index = i; // 최소값일 때 인덱스
            }
        }
        
        answer = array[min_index]; // array에서 temp의 최소값일 때 인덱스를 넣어 가장 가까운 값 찾기
        System.out.println(answer);
    }
}
// 다른풀이 temp로 빼지 않고 array안에서 처리할 수 있음
/*
    for(int i = 0; i < array.length; i++){
        Math.abs(array[0] - n) // 이 값을 최소값으로 가정하고
        if( Math.abs(array[0] - n) > Math.abs(array[i] - n)){ // n과 배열의 값의 차이의 절대값이 더 작다면 최소값
            array[0] = array[i]
        }
        // 결국은 n - array[i]의 절대값이 가장 작은 수가 가장 가까운 수!!
    }
 */