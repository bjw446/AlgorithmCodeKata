class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]){
                char temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }
        String str2 = new String(arr);
        answer = Long.parseLong(str2);
        return answer;
    }
}