import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> basket = new Stack<>();
        basket.push(0); // ㅅㅣㅈㅏㄱㄱㅏㅂㅅ ㅂㅣㄱㅛㄹㅡㄹ ㅍㅕㄴㅎㅏㄱㅔ ㅎㅏㄹㅕㄱㅗ
        
        for(int move : moves){
            for(int j=0; j<board.length; j++){
                if(board[j][move-1] != 0){
                      if(basket.peek() == board[j][move-1]){
                          basket.pop();
                          answer += 2;
                      }else{
                          basket.push(board[j][move-1]);
                      } 
                    board[j][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}