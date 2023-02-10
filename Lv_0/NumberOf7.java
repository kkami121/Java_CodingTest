package Lv_0;
// 프로그래머스 Lv_0 7의 개수
public class NumberOf7 {
    
    public static void main(String[] args){
// ----------------------------반복문 사용----------------------------
        int[] array1 = {7, 777, 17}; // 반복문 사용 array
        int count1 = 0; // 반복문 사용 count

        for(int i = 0; i < array1.length; i++){
            while(array1[i] > 10){
                if(array1[i] % 10 == 7){
                    count1++;
                }
                array1[i] /= 10;       
            }
            if(array1[i] % 10 == 7){
                count1++;
            }         
        }
        System.out.println(count1);


// ----------------------------재귀함수 사용----------------------------
        int[] array2 = {7, 777, 17}; // 재귀함수 사용 array

        for(int i = 0; i < array2.length; i++){
            search(array2[i]);
        }
        System.out.println(count2);
        
    }
    private static int count2 = 0; // 재귀함수 사용 count
    
    public static void search(int num){ // 재귀함수
        if(num % 10 == 7){
            count2++;
        }
        if(num > 10){
            search(num / 10);
        }
    }
}
