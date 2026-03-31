import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {         Map<String, Integer> rank = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for (String name : callings) {
            int currentRank = rank.get(name);
            int frontRank = currentRank - 1;
            
            String frontPlayer = players[frontRank];
            players[frontRank] = name;
            players[currentRank] = frontPlayer;
            
            rank.put(name, frontRank);
            rank.put(frontPlayer, currentRank);
        }
        return players;
    }
}