import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x * 2, 1});
        queue.add(new int[]{x * 3, 1});
        queue.add(new int[]{x + n, 1});
        
        Set<Integer> set = new HashSet<>();
        set.add(x * 2);
        set.add(x * 3);
        set.add(x + n);
        
        if(x == y) return 0;
        
        while(!queue.isEmpty()){
            int[] num = queue.poll();
            
            if(num[0] == y){
                return num[1];
            }
            
             if (num[0] + n <= y && !set.contains(num[0] + n)) {
                queue.add(new int[]{num[0] + n, num[1] + 1});
                set.add(num[0] + n);
            }
            
            if((num[0]*2 <= y) && (!set.contains(num[0]*2))){
                queue.add(new int[]{num[0]*2, num[1]+1});
                set.add(num[0]*2);
            }
            
            if (num[0] * 3 <= y && !set.contains(num[0] * 3)) {
                queue.add(new int[]{num[0] * 3, num[1] + 1});
                set.add(num[0] * 3);
            }
            
        }

        return -1;
    }
}