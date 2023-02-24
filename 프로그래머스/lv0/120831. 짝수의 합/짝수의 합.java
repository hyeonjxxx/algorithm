import java.util.ArrayList;

class Solution {
    public int solution(int n) {

        ArrayList<Integer> evenList = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            if(i%2==0){
                evenList.add(i);
            }
        }
        
       int answer = evenList.stream().mapToInt(Integer::intValue).sum();
    
        // mapToInt(Integer::intValue) : Integer list 데이터 목록을 int 배열 형식으로 반환
        
        return answer;
    }
}