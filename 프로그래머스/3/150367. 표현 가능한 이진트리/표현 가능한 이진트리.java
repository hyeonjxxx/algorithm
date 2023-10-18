class Solution {
    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        
        // 1. 자연수 >> 이진수
        for (int i = 0; i < numbers.length; i++) {            
            String binaryNum = Long.toBinaryString(numbers[i]);
            
            // 2. 포화이진트리로 만들기 
            int fullBinaryTree = 1;        
            int h = 1;
            
            while(fullBinaryTree < binaryNum.length()) {
               fullBinaryTree = (int) Math.pow(2, h++) - 1; 
            }
            
            int addZero = fullBinaryTree - binaryNum.length();
            binaryNum = "0".repeat(addZero) + binaryNum;
            // System.out.println(binaryNum);
                    
            if (binarySearch(binaryNum)) {
                answer[i] = 1;                
            } else {
                answer[i] = 0;
            }
                        
        }
        return answer;
    }
    
    // 3. 바이너리 서치 
    private static boolean binarySearch(String binaryNum){
        if (binaryNum.length() <= 1) {
            return true;
        }
        
        int mid = binaryNum.length() / 2;        
        String leftTree = binaryNum.substring(0, mid);
        String rightTree = binaryNum.substring(mid + 1);
        
        char target = binaryNum.charAt(mid);
        char left = leftTree.charAt(leftTree.length() / 2);
        char right = rightTree.charAt(rightTree.length() / 2);
        // System.out.println(binaryNum+", " + left+", " + right +", "+mid+", "+target);
        if (target == '0' && (left == '1' || right == '1')) {
            return false;
            
        } else {            
            return binarySearch(leftTree) && binarySearch(rightTree);
        }
    }
    
}