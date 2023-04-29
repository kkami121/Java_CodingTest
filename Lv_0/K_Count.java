package Lv_0;
class K_Count {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int t = i; t <= j; t++){
            String strK = Integer.toString(t);
            
            for(int kLength = 0; kLength < strK.length(); kLength++){
                if(Integer.toString(k).equals(strK.substring(kLength, kLength+1))){
                    answer++;
                }
            }
        }
        return answer;
    }
}