class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        int index = 0;

        while (n > 0) {
            arr[index] = n % 3;
            n = n / 3;
            index++;
        }
        int[] arr2 = new int[index];
        for (int i = index - 1; i >= 0; i--) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            answer = answer * 3 + arr2[i];
        }
        return answer;
    }
}