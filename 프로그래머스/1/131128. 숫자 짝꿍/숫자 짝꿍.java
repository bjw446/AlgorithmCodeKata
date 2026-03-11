class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int common = Math.min(countX[i], countY[i]);
            for (int j = 0; j < common; j++) {
                stringBuilder.append(i);
            }
        }

        if (stringBuilder.length() == 0) {
            answer =  "-1";
            return answer;
        }
        
        if (stringBuilder.charAt(0) == '0') {
            answer =  "0";
            return answer;
        }
        
        answer =  stringBuilder.toString();
        return answer;
    }
}