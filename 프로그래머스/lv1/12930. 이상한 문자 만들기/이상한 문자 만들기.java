class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] splitString = s.split(" ", -1);
        for(int j = 0; j < splitString.length; j++) {
            for(int i = 0; i < splitString[j].length(); i++) {
                if(i % 2 == 0) answer.append(Character.toUpperCase(splitString[j].charAt(i)));
                else answer.append(Character.toLowerCase(splitString[j].charAt(i)));
            }
            if(j < splitString.length - 1) answer.append(" ");
        }
        return answer.toString();
    }
}