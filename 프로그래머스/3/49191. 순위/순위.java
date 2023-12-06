import java.util.*;

class Solution {
     public int solution(int n, int[][] results) {
        int answer = n;
        int INF = n * n;
        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], INF);
            graph[i][i] = 0;
        }

         System.out.println(Arrays.deepToString(graph));
         
        for (int[] result : results) {
            graph[result[0] - 1][result[1] - 1] = 1;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (graph[i][j] == INF && graph[j][i] == INF) {
                    answer--;
                    break;
                }
            }
        }
System.out.println(Arrays.deepToString(graph));
        return answer;
     }
}