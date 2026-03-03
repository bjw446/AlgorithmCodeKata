class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length -2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k ++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean prime = true;
                    if (sum < 2) {
                        prime = false;
                    } else {
                        for (int a = 2; a <= Math.sqrt(sum); a++) {
                            if (sum % a == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }
                    if (prime) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}