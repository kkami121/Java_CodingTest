package etc;
import java.util.*;
public class three {
    
    public static void main(String [] agrs) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++){
            answer += (A[i]*B[B.length - 1 -i]);
        }

        System.out.println(answer);
    }
}
