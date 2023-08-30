class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        if (x < 10) {
            return true;
        }

        String[] strings = String.valueOf(x).split("");

        int a = 0;
        for (int i = 0; i < strings.length; i++) {
            a += Integer.parseInt(strings[i]);
        }

        if(x % a == 0) {
            answer = true;
        }
        
        return answer;
    }
}