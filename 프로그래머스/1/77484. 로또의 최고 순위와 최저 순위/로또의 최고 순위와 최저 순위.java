class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int matchCount = 0;
        int zeroCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else {
                for (int win : win_nums) {
                    if (num == win) {
                        matchCount++;
                        break;
                    }
                }
            }
        }

        int max = matchCount + zeroCount;
        int min = matchCount;
        
        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        answer = new int[]{rank[max], rank[min]};
        return answer;
    }
}