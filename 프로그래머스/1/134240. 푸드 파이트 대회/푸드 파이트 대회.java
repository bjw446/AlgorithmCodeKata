class Solution {
    public String solution(int[] food) {
        
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left.append(i);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(0);
        result.append(left.reverse());
        
        String answer = String.valueOf(result);
        return answer;
    }
}