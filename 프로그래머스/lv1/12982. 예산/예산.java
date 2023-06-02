import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int answer = 0;
        Arrays.sort(d);
        for(int x : d) {
            sum+=x;
            if(sum <= budget) {
                answer+=1;
            } else {
                break;
            }
        }
        return answer;
    }
}