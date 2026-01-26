class Solution {
    public int solution(int num) {
        int answer = 0;
        if (num == 0) { 
            answer = 0;
            return answer;
        }
        while(num != 1) {
            if (num%2 == 1) {
                num = num * 3 + 1;
                answer++;
            }
            num = num / 2;
            answer++;
            if (answer == 500) {
                answer = -1;
                return answer;
            }
        }
        return answer;
    }
}