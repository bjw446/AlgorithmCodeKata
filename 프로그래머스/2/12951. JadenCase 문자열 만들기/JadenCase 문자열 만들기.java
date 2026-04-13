class Solution {
    public String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        
        boolean isFirst = true;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append(c);
                isFirst = true;
            } else {
                if (isFirst) {
                    stringBuilder.append(Character.toUpperCase(c));
                    isFirst = false;
                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
            }
        }
        
        return stringBuilder.toString();
    }
}