class Solution {
    public int solution(int[][] sizes) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (a < Math.max(sizes[i][0], sizes[i][1])) {
                a = Math.max(sizes[i][0], sizes[i][1]);
            }
            if (b < Math.min(sizes[i][0], sizes[i][1])) {
                b = Math.min(sizes[i][0], sizes[i][1]);
            }
        }
        return a * b;
    }
}