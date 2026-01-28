class Solution {
    public String solution(int n) {
        String answer = "";
        String s = "수박";
        
        String[] strings = new String[n];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(s.charAt(0));
        }
        for (int i = 1; i < strings.length; i++) {
            strings[i] = String.valueOf(s.charAt(1));
            i = i + 1;
        }
        answer = String.join("", strings);
        return answer;
    }
}