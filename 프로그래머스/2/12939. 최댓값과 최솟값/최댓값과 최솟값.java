class Solution {
    public String solution(String s) {
        String[] parts = s.split(" ");
        
        int min = Integer.parseInt(parts[0]);
        int max = Integer.parseInt(parts[0]);
        
        for (int i = 1; i < parts.length; i++) {
            int num = Integer.parseInt(parts[i]);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        return min + " " + max;
    }
}