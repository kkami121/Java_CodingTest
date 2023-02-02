package etc;
public class one {
    public static void main(String [] agrs) {
        String s = "1 2 3 4";
        String answer = "";
       
        String [] sp = s.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < sp.length; i++){
            int number = Integer.parseInt(sp[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        answer = min + " " + max;
        System.out.println(answer);
    }
}