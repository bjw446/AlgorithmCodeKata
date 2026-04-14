class Solution {
    public int[] solution(String s) {
        int count = 0; 
        int removeZero = 0;   

        while (!s.equals("1")) {
            int zeros = s.length() - s.replace("0", "").length();
            removeZero += zeros;

            int length = s.length() - zeros;

            s = Integer.toBinaryString(length);

            count++;
        }

        return new int[]{count, removeZero};
    }
}