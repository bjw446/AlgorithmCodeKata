class Solution {
    public int[] solution(int brown, int yellow) {
        int totalCount = brown + yellow;
        
        for (int height = 3; height <= totalCount; height++) {
            int width = totalCount / height;
            
            if (totalCount % height == 0) {
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[]{width, height};
                }
            }
        }
        
        return new int[0];
    }
}