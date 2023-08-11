class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for(int i=food.length-1; i>0; i--){
            for(int f=0; f<food[i]/2; f++){
                answer = i + answer + i;
            }
        }
        
        return answer;
    }
}