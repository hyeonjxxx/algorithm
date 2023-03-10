import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] chess = {1, 1, 2, 2, 2, 8};   // 체스의 갯수
        int[] input = new int[chess.length]; // 입력받을 숫자을 저장할 배열

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<chess.length; i++){
            input[i] = sc.nextInt();  // 숫자 입력받아서 배열에 저장
            System.out.print(chess[i] - input[i] + " "); // 출력
        }
    }
}
