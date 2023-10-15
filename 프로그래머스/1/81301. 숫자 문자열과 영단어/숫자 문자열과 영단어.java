class Solution {
    public int solution(String s) {
        String input = s;
        String[] numberToWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numberToWord.length; i++) {
            input = input.replace(numberToWord[i], Integer.toString(i));
        }
        return Integer.parseInt(input);
    }
}