class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;
        for(int i : section) {
            if(i > max) {
                answer++;
                max = i + m - 1;
            }
        }
        return answer;
    }
}