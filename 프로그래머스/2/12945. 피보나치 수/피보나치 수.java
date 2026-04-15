class Solution {
    public int solution(int n) {
        int division = 1234567;
        int a = 0; 
        int b = 1; 
        
        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % division;
            a = b;
            b = temp;
        }
        
        return b; 
    }
}