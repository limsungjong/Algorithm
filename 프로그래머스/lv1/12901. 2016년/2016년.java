import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String[] dayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String answer = "";
        int[] months = {0, 31,29,31,30,31,30,31,31,30,31,30,31};
        int curDay = 6;
        for(int month = 1; month <= 12; month++) {
        int monthOfInDay = months[month];    
            for(int day = 1; day <= monthOfInDay; day++) {
                if(month == a && day == b) {
                    answer = dayOfWeek[curDay - 1];
                    break;
                }
                curDay = (curDay % 7) + 1;
            }
        }
        return answer;
    }
}