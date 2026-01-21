class Solution {
    public int solution(int num1, int num2) {
        double num3 = (double) num1 / num2;
        double num4 = num3 * 1000;
        int answer = (int) num4;
            System.out.println("num1이 " + num1 + "이고 num2가 " + num2 + "이므로 " + num1 + " / " + num2 + " = " + num3 + "에 1,000을 곱하면 " + num4 + "이 됩니다.");
            return answer;
    }
}