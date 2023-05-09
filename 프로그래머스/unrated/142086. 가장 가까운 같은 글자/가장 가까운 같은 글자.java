import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];
        for(int i = 0; i < s.length(); i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i],i);
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(arr[i]);
                map.put(arr[i],i);
            }
        }
        return answer;
    }
}