import java.util.Arrays;
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;

        double average = Arrays.stream(numbers).average().orElse(0);
        
        // average() : 평균값 / OptionalDouble 클래스 메소드
        // orElse() : return할 값이 null경우, 메서드에서 넘겨준 값을 return / OptionalDouble 클래스 메소드 
        
        return average;
    }
}