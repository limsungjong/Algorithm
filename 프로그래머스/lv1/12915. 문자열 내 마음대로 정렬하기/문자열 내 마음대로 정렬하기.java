import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> stringArrayList = Arrays.asList(strings);
        stringArrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                Character i1 = o1.charAt(n);
                Character i2 = o2.charAt(n);
                int x = i1.compareTo(i2);

                if(x == 0) {
                    return o1.compareTo(o2);
                }

                return i1.compareTo(i2);
            }
        });

        return stringArrayList.toArray(String[]::new);
    }
}