
class Solution {
    public String solution(String s) {
        String[] strings = s.split(" ", -1);
        StringBuilder strBuilder = new StringBuilder();
        for(int i = 0; i < strings.length; i++) {
            for(int j = 0; j < strings[i].length(); j++) {
                char q = j % 2 != 0 ? Character.toLowerCase(strings[i].charAt(j))
                    : Character.toUpperCase(strings[i].charAt(j));
                strBuilder.append(q);
            }
            if(i < strings.length - 1)strBuilder.append(" ");
        }
        return strBuilder.toString();
    }
}