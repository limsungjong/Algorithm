import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        int[] answer = new int[photos.length];

        HashMap<String, Integer> score = new HashMap<>();
        for (int i = 0; i < yearning.length; i++) {
            score.put(name[i], yearning[i]);
        }

        int idx = 0;
        for (String[] photo : photos) {
            int value = 0;
            for (String x : photo) {
                if (score.get(x) != null) {
                    value += score.get(x);
                }
            }
            answer[idx] = value;
            idx++;
        }
        return answer;
    }
}