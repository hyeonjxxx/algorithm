import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j <numbers.length; j++){
                // 중복 제거
                if(!list.contains(numbers[i]+numbers[j])){
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }        
        
        // 정렬
        Collections.sort(list);
        
        // ArrayList<Integer> -> int[]
        int index = 0;
        int[] answer = new int[list.size()];
        for(int num : list){
            answer[index++] = num;
        }
        return answer;
    }
}