import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // i = 줄
       for(int i = 1; i <= n; i++) {
        // j = 별
           for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           System.out.println("");
        }
        
    }
}