class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            String temp = b;
            boolean valid = true;
            String prev = "";

            while (!temp.isEmpty()) {
                boolean match = false;
                for (String w : words) {
                    if (temp.startsWith(w)) {
                        if (prev.equals(w)) {
                            valid = false;
                            break;
                        }
                        prev = w;
                        temp = temp.substring(w.length());
                        match = true;
                        break;
                    }
                }
                if (!match) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                answer++;
            }
        }
        return answer;
    }
}