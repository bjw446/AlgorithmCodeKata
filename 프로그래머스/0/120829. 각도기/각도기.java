class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
            System.out.println("angle이 " + angle + "이므로 예각입니다. 따라서 " + answer + "을 return 합니다.");
            return answer;
        } else if (angle == 90) {
            answer = 2;
            System.out.println("angle이 " + angle + "이므로 직각입니다. 따라서 " + answer + "을 return 합니다.");
            return answer;
        } else if (90 < angle && angle < 180) {
            answer = 3;
            System.out.println("angle이 " + angle + "이므로 둔각입니다. 따라서 " + answer + "을 return 합니다.");
            return answer;
        } else if (angle == 180) {
            answer = 4;
            System.out.println("angle이 " + angle + "이므로 평각입니다. 따라서 " + answer + "을 return 합니다.");
            return answer;
        }
        return answer;
    }
}