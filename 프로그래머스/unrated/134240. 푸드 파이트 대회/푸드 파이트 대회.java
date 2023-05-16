class Solution {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.append(i);
            }
        }
        StringBuffer tmp = new StringBuffer();
        tmp.append(answer);
        tmp.append(0);
        tmp.append(answer.reverse());
        System.out.println(tmp);
        return tmp.toString();
    }
}