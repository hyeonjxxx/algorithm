class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 각 배열의 같은 인덱스값들의 곱을 더해주기
        for(int i=0; i<a.length; i++){
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}
