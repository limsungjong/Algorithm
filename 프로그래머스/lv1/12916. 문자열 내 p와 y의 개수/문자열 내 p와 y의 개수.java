
class Solution {
    boolean solution(String s) {
        
        int count1 = 0;
        int count2 = 0;
        for(String x : s.split("")) {
            if(x.equalsIgnoreCase("p")) {
                count1++;
            } else if (x.equalsIgnoreCase("y")) {
                count2++;
            }
        }
        return count1 == count2;
    }
}