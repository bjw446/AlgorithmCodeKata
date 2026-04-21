class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            int a = answer;
            int b = arr[i];
            
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int gcd = a;
            
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
}