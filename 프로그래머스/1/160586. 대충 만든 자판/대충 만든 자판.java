import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> min = new HashMap<>();
        
        for(String key : keymap) {
            for(int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int count = i + 1;
                min.put(c, Math.min(min.getOrDefault(
                    c, Integer.MAX_VALUE), count));
            }
        }
        
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int total = 0;
            boolean possible = true;
            
            for(char c : target.toCharArray()) {
                if (!min.containsKey(c)) {
                    possible = false;
                    break;
                }
                total += min.get(c);
            }
            answer[i] = possible ? total : -1;
        }
        return answer;
    }
}