import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Solution {
    public int solution(String dartResult) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        int answer = 0;

        String regex = "(\\d+|[A-Z][*#]?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dartResult);

        int count = 0;
        while (matcher.find()) {
            if (count % 2 == 0) integerArrayList.add(Integer.parseInt(matcher.group()));
            else stringList.add(matcher.group());
            count++;
        }

        for (int i = 0; i < 3; i++) {
            char Multi = stringList.get(i).charAt(0);
            int value = integerArrayList.get(i);
            switch (Multi) {
                case 'S':
                    answerList.add(i, (int) Math.pow(value, 1));
                    break;
                case 'D':
                    answerList.add(i, (int) Math.pow(value, 2));
                    break;
                case 'T':
                    answerList.add(i, (int) Math.pow(value, 3));
                    break;
            }
            if (stringList.get(i).length() > 1) {
                char exp = stringList.get(i).charAt(1);
                switch (exp) {
                    case '*':
                        int a = answerList.get(i) * 2;
                        answerList.set(i, a);
                        if (i != 0) {
                            int b = answerList.get(i - 1) * 2;
                            answerList.set(i - 1, b);
                        }
                        break;
                    case '#':
                        int c = answerList.get(i);
                        answerList.set(i, c * -1);
                        break;
                }
            }
        }
        for (Integer v : answerList) {
            answer += v;
        }
        return answer;
    }
    
}