class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];
        for(int i=0; i<numbers.length; i++){
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}


/*
다른 사람 풀이 추가
1. 향상된 for문
    for(int num :numbers){
      answer.add(num*2)
    }

2. strem 사용
    return Arrays.stream(numbers).map(i -> i * 2).toArray();

*/
