class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 1 + i; j < number.length; j++) {
                for (int x = 1 + j; x < number.length; x++) {
                    if ((number[i] + number[j] + number[x]) == 0) {
                        System.out.println(" i " + number[i] + " j " + number[j] + " x " + number[x]);
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}