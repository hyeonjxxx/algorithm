import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        /*
         햄버거 = 1231
         재료를 순회하면서 stack으로 하나씩 담아줌
         stack의 길이가 4이상이 되면 마지막에 쌓인 4개로 햄버거 만들수 있는지 확인
         만들수 있다면 answer++
         stack에서 확인한 4개 제거
        */
            
        int answer = 0;                
        Stack<Integer> burgerStack = new Stack<>();
        
        for(int i : ingredient){
            burgerStack.push(i);            
            if(burgerStack.size() >= 4) {
                int size = burgerStack.size();
                if(burgerStack.get(size-1) == 1
                  && burgerStack.get(size-2) == 3
                  && burgerStack.get(size-3) == 2
                  && burgerStack.get(size-4) == 1) {
                    answer++; 
                    for (int j = 0; j < 4; j++) {
                        burgerStack.pop();
                    }
                }                
            }
        }
        return answer;
    }
}