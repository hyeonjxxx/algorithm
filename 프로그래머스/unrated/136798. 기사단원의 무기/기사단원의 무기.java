class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;        
        
        for(int i=1; i<=number; i++){
            if(getNum(i) <= limit) answer += getNum(i);
            else answer += power;   
        }
        
        return answer;
    }
    
    public int getNum(int num) {
        int cnt = 0;
        
        for(int i = 1; i*i <= num; i++){
            // i가 num의 제곱근일 경우 
            if(i * i == num) cnt++;
            else if(num % i == 0) cnt +=2;
        }
        
        return cnt;
    }
    
}