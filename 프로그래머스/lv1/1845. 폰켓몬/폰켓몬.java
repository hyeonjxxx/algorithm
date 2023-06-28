import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pickNum = nums.length/2;
        // 1. 고를수 있는 폰켓몬의 수는 nums/2
        // 2. 고른 폰켓몬의 종류가 최대 nums의 배열을 중복제거
        // 3. 1과 2의 값을 비교하여 최솟값 반환
        
        // Stream.distinct()으로 중복제거
         Arrays.sort(nums);
        int[] temp = Arrays.stream(nums).distinct().toArray();
        
        answer = pickNum;
        
        if(temp.length < pickNum){
            answer = temp.length;
        }
       
        return answer;
    }
}