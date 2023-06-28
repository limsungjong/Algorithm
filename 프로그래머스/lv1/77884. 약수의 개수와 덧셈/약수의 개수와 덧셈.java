class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = 0; i <= right - left; i++) {
            int v = m(left+i);
            if(v % 2 == 0) {
                answer+=left + i;
            } else {
                answer-=left + i;
            }
        }
        return answer;
    }
    
    public int m(int v) {
        int count = 0;
        for(int i = 1; i <= Math.sqrt(v); i++) {
            if(v % i == 0) {
                count++;
                if(i * i != v) {
                    count ++;
                }
            }
        }
        return count;
    }
}