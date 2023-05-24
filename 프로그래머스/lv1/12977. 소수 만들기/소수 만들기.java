
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1 + i; j < nums.length; j++) {
                for(int k = 1 + j; k < nums.length; k++) {
                    if(getMinority(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }   
        }
        return answer;
    }
    public boolean getMinority(int num) {
        if(num < 2) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}