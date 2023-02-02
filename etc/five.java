package etc;
import java.util.*;

public class five {
    public static void main(String [] agrs) {
        boolean answer = true;
        
        String s = "()()";
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else{
                if(stack.isEmpty()){
                    answer =  false;
                }
                else{
                    stack.pop();
                }
            }
        }

        answer = (stack.isEmpty()) ? true : false;
        System.out.println(answer);

    }
}