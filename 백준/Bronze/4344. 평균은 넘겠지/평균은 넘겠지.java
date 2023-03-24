import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 소수점 셋째 자리까지 출력
        // 첫째 줄은 테스트 케이스의 개수
        // 둘째 줄부터 각 테스트 케이스마다 학생 수

        Scanner sc = new Scanner(System.in);

       // int[] arr;  //
        int testcase = sc.nextInt();     // 테스트케이스

        for(int i=0; i<testcase; i++){

            int student = sc.nextInt();      // 학생 수
            int[] arr = new int[student];

            double sum = 0;      // 성적 누적 합

            // 성적입력 + 성적 누적 합
            for(int j=0; j<student; j++){
                int score = sc.nextInt();
                arr[j]=score;
                sum+=score;
            }

            double avg = (sum/student);     // 성적의 평균
            double count = 0;       // 평균이 넘는 학생 수

            // 평균는 넘겠지 찾기
            for(int j=0; j<student; j++){
                if(arr[j] > avg){
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/student)*100);

        }
            sc.close();

        }
}
