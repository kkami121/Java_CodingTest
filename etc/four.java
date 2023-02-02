package etc;
public class four {
    public static void main(String [] agrs) {

        String s = "110010101001";
        int[] answer = new int[2];
    
        while(s.length() > 1) {
    
        int cntOne = 0;
        for(int i=0; i<s.length(); i++) {
    
            if(s.charAt(i) == '0') answer[1]++;
            else cntOne++;
        }
    
        s = Integer.toBinaryString(cntOne);

        System.out.println(s.getClass().getName());
        answer[0]++;
        }
    }
    
}
