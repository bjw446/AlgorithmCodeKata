import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scoreMap = new HashMap<>();
        for (char c : new char[] {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}) {
            scoreMap.put(c, 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            int choice = choices[i];
            
            int diff = choice - 4;
            if (diff < 0) {
                scoreMap.put(disagree, 
                             scoreMap.get(disagree) + 
                             Math.abs(diff));
            } else if (diff > 0) {
                scoreMap.put(agree, scoreMap.get(agree) + diff);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        answer.append(
            scoreMap.get('R') >= scoreMap.get('T') ? 'R' : 'T'
        );
        answer.append(
            scoreMap.get('C') >= scoreMap.get('F') ? 'C' : 'F'
        );
        answer.append(
            scoreMap.get('J') >= scoreMap.get('M') ? 'J' : 'M'
        );
        answer.append(
            scoreMap.get('A') >= scoreMap.get('N') ? 'A' : 'N'
        );
        
        return answer.toString();
    }
}