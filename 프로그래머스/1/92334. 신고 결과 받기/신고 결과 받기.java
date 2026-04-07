import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> reportedCount = new HashMap<>();
        
        for(String rep : reportSet) {
            String[] parts = rep.split(" ");
            String reportedUser = parts[1];
            reportedCount.put(reportedUser, reportedCount.getOrDefault(reportedUser, 0) + 1);
        }
        
        Set<String> suspendedUsers = new HashSet<>();
        
        for (Map.Entry<String, Integer> entry : reportedCount.entrySet()) {
            if (entry.getValue() >= k) {
                suspendedUsers.add(entry.getKey());
            }
        }
        
        Map<String, Integer> mailCount = new HashMap<>();
        
        for (String rep : reportSet) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String reportedUser = parts[1];
            
            if (suspendedUsers.contains(reportedUser)) {
                mailCount.put(reporter, mailCount.getOrDefault(reporter, 0) + 1);
            }
        }
        
        int[] answer = new int[id_list.length];
        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}