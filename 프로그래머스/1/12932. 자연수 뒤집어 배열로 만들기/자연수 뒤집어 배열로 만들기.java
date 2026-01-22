class Solution {
    public int[] solution(long n) {
        String string = String.valueOf(n);
        int length = string.length(); 
        int[] answer = new int[length];
        int index = 0;
        while(n > 0) {
            answer[index] = (int) (n % 10);
            n = n / 10;
            index++;
        }
        return answer;
    }
}