class Solution {
    public long solution(int price, int money, int count) {
        long current = 0;

        for (long i = 1; i <= count; i++) {
            current += price * i;
        }


        return money - current >= 0 ? 0 : current - money;
    }
}