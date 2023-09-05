class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // for문을 돌면서 
        // 1. 0의 개수를 세고
        // 2. lottos 배열과 win_nums 배열
        // 순위는 6개일치 1등, 1개 일치 6등 >> 
        
        int zeroCnt = 0;
        int numMatch = 0;
        
        for(int lotto : lottos){
            for(int num : win_nums){
                if(lotto == num) numMatch++; 
            }
           if(lotto == 0) zeroCnt++; 
        }
        
        answer[0] = (zeroCnt+numMatch==0) ? 6 : 7 - (zeroCnt+numMatch);
        answer[1] = (numMatch==0) ? 6 : 7 - numMatch;
        
        return answer;
    }
}