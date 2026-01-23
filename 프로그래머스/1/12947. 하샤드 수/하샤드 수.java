class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = arr[i] - '0';
            sum = sum + intArr[i];
        }
        if (x % sum == 0) {
            return answer;
        }
        answer = false;
        return answer;
    }
}