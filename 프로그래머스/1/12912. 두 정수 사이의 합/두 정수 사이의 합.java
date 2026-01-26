class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if ( a == b) {
            answer = a;
            return answer;
        }
        
        
        if (a < b) {
            answer = answer + a;
            while(a < b) {
            a++;    
            int sum = a ;
            answer = answer + sum;
            }
        } else {
            answer = answer + b;
            while(b < a) {
            b++;
            int sum = b ;
            answer = answer + sum;
            }
        }
        return answer;
    }
}