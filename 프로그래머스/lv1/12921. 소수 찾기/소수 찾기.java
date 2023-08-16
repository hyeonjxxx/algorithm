import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag;        
        
        for(int i=2; i<=n; i++){
            flag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                   flag = false;
                    break;
                }
            }
            if(flag) {
                answer++;
            }
        }
//         int measure = 0;
//         for(int i=2; i<=n; i++){
//             for(int j=2; j<=i; j++){                
//                 System.out.println("i : " + i);
//                 System.out.println("j : " + j);
                
                
//                 if(i%j == 0){
//                     System.out.println(i%j);
//                     // if(i/j == i || i/j == 1){
//                         // System.out.println(i/j);
//                         measure++;    
//                     // }                    
//                 }
//             }
//         System.out.println("i의 값은 "+i);    
//         }
        
//             if(measure == 1) {
//              System.out.println(measure);
//                 answer++;
//                 measure = 0;
//             }
        return answer;
    }
}