class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // 길이가 4 혹은 6인가?
        if(s.length()==4 || s.length()==6){
            
            // 숫자로만 구성되어 있나?
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                    return false;
                }
            }
        }else{
                    return false;   
                }        
        return answer;
    }   
}