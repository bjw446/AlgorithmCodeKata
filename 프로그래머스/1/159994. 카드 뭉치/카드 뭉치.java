class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        String answer = "Yes";

        for (String word : goal) {
            if (index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}