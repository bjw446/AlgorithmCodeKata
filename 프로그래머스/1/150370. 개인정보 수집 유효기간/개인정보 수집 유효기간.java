import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        String[] tParts = today.split("\\.");

        int todayValue = (Integer.parseInt(tParts[0]) * 12 * 28)
                       + (Integer.parseInt(tParts[1]) * 28)
                       + Integer.parseInt(tParts[2]);

        
        Map<String, Integer> termMap = new HashMap<>();
        
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String[] dateParts = parts[0].split("\\.");
            String type = parts[1];
            
            int collected = (Integer.parseInt(dateParts[0]) * 12 * 28)
                          + (Integer.parseInt(dateParts[1]) * 28)
                          + Integer.parseInt(dateParts[2]);
            
            int expire = collected + termMap.get(type) * 28;
            
             if (expire <= todayValue) {
                 answer.add(i + 1);
             }

        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}