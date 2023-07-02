class Solution {
    public int solution(int[][] sizes) {
        
        int max_width = 0;
        int max_height = 0;
        
        for(int i=0; i<sizes.length; i++){
            
            // 가로,세로를 비교해 긴값을 가로, 짧은 값을 세로
            int max = Math.max(sizes[i][0],sizes[i][1]);
            int min = Math.min(sizes[i][0],sizes[i][1]);
            
            max_width = Math.max(max_width, max);
            max_height = Math.max(max_height, min);
                
        }
        return max_width * max_height;
    }
}