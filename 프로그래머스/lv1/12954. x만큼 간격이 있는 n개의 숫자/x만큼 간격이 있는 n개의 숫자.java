class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(long i = 1; i <= n; i++) {
            answer[Math.toIntExact(i - 1)] = i * x;
        }
        return answer;
    }
}