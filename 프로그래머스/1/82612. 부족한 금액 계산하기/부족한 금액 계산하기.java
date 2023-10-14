class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long a = 0;
        for(int i = 1; i <= count; i++) {
            a += price * i;
        }

        
        if(money - a >= 0) {
            return 0;
        }
        answer = (a - money);
        return answer;
    }
}