class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int priceCount = price;

        while (!(count == 0)) {
            answer += price;
            price += priceCount;
            count--;
        }
        if (money > answer) {
            answer = 0;
            return answer;
        }
        answer -= money;
        return answer;
    }
}