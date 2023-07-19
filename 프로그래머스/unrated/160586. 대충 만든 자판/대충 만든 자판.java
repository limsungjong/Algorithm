import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keyHashMap = new HashMap<>();
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                Character character = key.charAt(i);
                keyHashMap.put(character, Math.min(i + 1, keyHashMap.getOrDefault(character, Integer.MAX_VALUE)));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String targetString = targets[i];

            for (int j = 0; j < targetString.length(); j++) {
                char targetChar = targetString.charAt(j);
                if (keyHashMap.containsKey(targetChar)) {
                    answer[i] += keyHashMap.get(targetChar);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        

        return answer;
    }
}