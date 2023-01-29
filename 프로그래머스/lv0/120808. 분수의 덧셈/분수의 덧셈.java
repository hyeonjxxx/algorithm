class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        // 1. 분수 덧셈
        int bmo = denom1 * denom2;
        int bja = (numer1*denom2)+(numer2*denom1);
        
        //2. 기약분수 만들기
        // 2_1. denom1과 denom2의 최대공약수 구하기
        int gcd = 1;
        for(int i=1; i<=bmo && i<=bja; i++){
            if(bmo % i == 0 && bja % i == 0){
                    gcd = i;
                }
            }
        
        // 3.최대공약수로 약분 후 배열에 담기
        answer[0] = bja/gcd;
        answer[1] = bmo/gcd;
        return answer;
    }
}