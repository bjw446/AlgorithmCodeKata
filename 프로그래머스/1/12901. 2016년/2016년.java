import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDate dateTime = LocalDate.of(2016, a, b);
        
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        answer = dayOfWeek.toString().substring(0, 3);
        
        return answer;
    }
}