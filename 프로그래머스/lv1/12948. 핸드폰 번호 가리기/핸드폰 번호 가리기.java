import java.util.*;
class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        String[] strings = phone_number.split("");

       for(int i = 0; i <strings.length - 4; i++) {
            answer.append("*");
        }

        for(int i = 4; i > 0; i--) {
            answer.append(strings[strings.length - i]);
        }

        return answer.toString();
    }
}