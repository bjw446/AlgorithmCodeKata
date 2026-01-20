class Solution {
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        System.out.println("2022년 기준 " + age + "살이므로 " + answer + "년생입니다.");
        return answer;
    }
}