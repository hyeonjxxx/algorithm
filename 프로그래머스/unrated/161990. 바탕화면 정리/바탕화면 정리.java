import java.lang.Math;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        // lux, luy = 드래그의 시작값, 
        // rdx, rdy = 드래그의 끝값
        int lux = 49; 
        int luy = 49; 
        int rdx = 0;
        int rdy = 0;
        
        // 2차배열로 담겨있는 wallpaper를 2중 for문 돌면서 "#"을 찾기           
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux,i);
                    luy = Math.min(luy,j);
                    rdx = Math.max(rdx,i);
                    rdy = Math.max(rdy,j);
                }
            }
        }
        
        // rdx, rdy는 각 +1씩 :드래그를 닫아주는 좌표이므로 구한 좌표값에서 +1
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx+1;
        answer[3] = rdy+1;
        
        return answer;
    }
}