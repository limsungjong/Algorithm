import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> valueToIndex = new HashMap<>();
        HashMap<Integer, String> indexToValue = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            valueToIndex.put(players[i], i+1);
            indexToValue.put(i+1, players[i]);
        }
        for (int i = 0; i < callings.length; i++) {
            String callName = callings[i];
            int callNumber = valueToIndex.get(callName);

            String leadName = indexToValue.get(callNumber - 1);
            int leadNumber = valueToIndex.get(leadName);

            indexToValue.put(leadNumber, callName);
            indexToValue.put(callNumber, leadName);

            valueToIndex.put(callName, leadNumber);
            valueToIndex.put(leadName, callNumber);
        }
        int idx=0;
        for(int key:indexToValue.keySet()){
            answer[idx++]=indexToValue.get(key);
        }
        return answer;
    }
}