class Solution {
    public String solution(int[] food) {
//         String answer = "0";
        
//         for(int i=food.length-1; i>0; i--){
//             for(int f=0; f<food[i]/2; f++){
//                 answer = i + answer + i;
//             }
//         }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            int setting = food[i]/2;
            
            for(int f=0; f<setting; f++){
                sb.append(i);   
            }            
        }
        String answer = sb.toString() + "0" + sb.reverse().toString();
        return answer;
    }
}