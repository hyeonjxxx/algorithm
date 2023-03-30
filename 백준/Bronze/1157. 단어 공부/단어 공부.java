import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int[] arr = new int[26];    // 영문자를 카운팅할 배열(영문자의 갯수가 26개)

        for(int i=0; i<word.length(); i++){
            if('A' <= word.charAt(i) && word.charAt(i) <= 'Z'){   // 대문자 범위
                arr[word.charAt(i) - 'A']++;   // 해당 인덱스의 값 1+
            }
            else {  // 소문자 범위
                arr[word.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';



        for(int i=0; i<26; i++){
            if(arr[i] > max){   // 해당 배열의 값이  max보다 클 경우,
                max = arr[i];   // max를 해당 배열의 값을 대치
                ch = (char)(i+'A'); // 대문자로 출력해야 됨 
            }
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}