package Lv_0;

public class test {
    public static void main(String[] args){
        String A = "hello";
        String B = "lohel";

        String tempB = B.repeat(3);  // 3번 반복
                                           // ex) B = "lohel"일 경우 tempB = "lohellohellohel"
        tempB.indexOf(A); // lohel lohel lohel 중 A가 해당되기 시작하는 인덱스 반환
                          // 시작할 위치는 0을 반환
                          // 없는 경우 -1을 반환
                          // ex)  012 
                          //        hello
                          //      lohellohelohel
                          // 2인덱스에서 시작함으로 2를 반환
        System.out.println(tempB.indexOf(A));
    }
}

