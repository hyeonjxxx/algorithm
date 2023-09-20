import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
        
        int answer = 0;
        long q1Sum = 0;
        long q2Sum = 0;
        
        for(int i=0; i<queue1.length; i++){
            q1Sum += queue1[i];
            q2Sum += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }
        
        if((q1Sum+q2Sum)%2!=0) return -1;
        
        while(q1Sum != q2Sum){
            answer++; 
            
            if(q1Sum > q2Sum){
                q1Sum -= q1.peek();
                q2Sum += q1.peek();
                q2.offer(q1.peek());
                q1.poll();             
                
            }else{
                q2Sum -= q2.peek();
                q1Sum += q2.peek();
                q1.offer(q2.peek());
                q2.poll();
            }
            
            if(answer > (queue1.length + queue2.length)*3) return -1;
            
        }
        
        
        return answer;
    }
}