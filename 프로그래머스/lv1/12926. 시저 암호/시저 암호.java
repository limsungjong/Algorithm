class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer.append(" ");
            } else if(s.charAt(i) >= 'a') {
                char x = (char) ((s.charAt(i) + n - 'a') % 26 + 'a');
                answer.append(x);
            } else {
                char x = (char) ((s.charAt(i) + n - 'A') % 26 + 'A');
                answer.append(x);
            }
        }
        return answer.toString();
    }
}