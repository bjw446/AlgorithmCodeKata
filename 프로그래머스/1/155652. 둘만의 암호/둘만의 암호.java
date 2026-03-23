import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        List<Character> alphabet = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            if(!skip.contains(String.valueOf(c))) {
                alphabet.add(c);
            }
        }
        
        for(char ch : s.toCharArray()) {
            int pos = alphabet.indexOf(ch);
            int newPos = (pos + index) % alphabet.size();
            answer.append(alphabet.get(newPos));
        }
        return answer.toString();
    }
}