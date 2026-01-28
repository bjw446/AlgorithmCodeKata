class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                int check = arr[i];
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == min)) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        return answer;
    }
}