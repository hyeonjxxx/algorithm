class Solution {
    public int solution(int n) {
        int answer = 1;
        
        // anwer*6%n == 0 
        while(true){
         if(answer*6%n == 0){
                break;
            }   
            answer++;
        }
        return answer;
    }
}