import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Set<Integer> lostSet = new HashSet<>();
        for (int i : lost) lostSet.add(i);

        Set<Integer> reserveSet = new HashSet<>();
        for (int r : reserve) reserveSet.add(r);

        Set<Integer> overlap = new HashSet<>(lostSet);
        overlap.retainAll(reserveSet);
        lostSet.removeAll(overlap);
        reserveSet.removeAll(overlap);

        for (int r : new TreeSet<>(reserveSet)) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }
        
        answer = n - lostSet.size();
        
        return answer;
    }
}