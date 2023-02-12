import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 배열의 크기 정하기 (n+1)은 홀수의 경우를 생각해서
        int[] answer = new int[(n+1)/2];
        
        for(int i=1; i<=n; i++){
            if(i%2==1){
                answer[i/2]=i;
            }
        }
        return answer;
    }
}