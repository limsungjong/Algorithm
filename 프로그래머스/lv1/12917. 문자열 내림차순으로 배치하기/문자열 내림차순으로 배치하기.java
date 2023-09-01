import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();

        Character[] characters = new Character[charArray.length];

        for(int i = 0; i < charArray.length; i++) {
            characters[i] = charArray[i];
        }

        Arrays.sort(characters,Comparator.reverseOrder());
        
        String answer = Arrays.stream(characters).map(String::valueOf).collect(Collectors.joining());

        return answer;
    }
}