class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            if (c >= 'a' && c <= 'z') {
                c = (char)((c-'a'+n)%26+'a');
            } else if (c >= 'A' && c <= 'Z') {
                c = (char)((c-'A'+n)%26+'A');
            }
            a[i] = c;
        }
        answer = new String(a);
        
        return answer;
    }
}