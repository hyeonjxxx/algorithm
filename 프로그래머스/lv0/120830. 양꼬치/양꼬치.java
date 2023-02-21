class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        // n이 10의 배수일경우 k-1개
        if(n / 10 >= 1) {
            k = k - ( n / 10);
        }
        answer = (n*12000)+(k*2000);
        return answer;
    }
}