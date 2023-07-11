import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        StringBuilder answer = new StringBuilder();
        LocalDate date = LocalDate.of(2016,a,b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        int dayOfWeekNumber = dayOfWeek.getValue();
        
        switch (dayOfWeekNumber) {
            case 1 -> {
                answer.append("MON");
            }
            case 2 -> {
                answer.append("TUE");
            }
            case 3 -> {
                answer.append("WED");
            }
            case 4 -> {
                answer.append("THU");
            }
            case 5 -> {
                answer.append("FRI");
            }
            case 6 -> {
                answer.append("SAT");
            }
            case 7 -> {
                answer.append("SUN");
            }
        }
        return answer.toString();
    }
}