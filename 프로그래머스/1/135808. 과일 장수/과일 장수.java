import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        int n = score.length;

        for (int i = n; i >= m; i -= m) {
            int minScore = score[i - m];
            int boxPrice = minScore * m;
            answer += boxPrice;
        }
        return answer;
    }
}