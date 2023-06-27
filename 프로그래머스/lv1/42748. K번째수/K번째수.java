import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 반환할 배열의 크기는 commands.length
        // commands.length만큼 반복문 돌면서
        // i부터 j번째 숫자까지 자르기
        // 첫번째 반환할 값을 찾기 위해 필요한 숫자들의 위치(?) >> (0,0) (0,1) (0,2)
        
        int[] answer = new int[commands.length];            
                    
        for(int i=0; i<commands.length; i++){
            
            //1. 자른 숫자를 담을 배열 크기는 (j-i)+1
            int[] temp = new int[(commands[i][1] - commands[i][0]) + 1];
            
            //1_1. 자른 숫자 배열에 담아주기        
            int n = 0;
            
            for(int j=(commands[i][0]-1); j< commands[i][1]; j++){
                temp[n] = array[j];
                n++;
            }
            // 2. 1에서 나온 배열 정렬
            Arrays.sort(temp);
            
            //3. 2에서 나온 배열의 k번째 숫자는? 
            // 배열의 인덱스는 0부터 시작하기 때문에 -1을 해줌
            answer[i] = temp[(commands[i][2])-1];
        }        
        
        return answer;
    }
}