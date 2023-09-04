import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = a.toCharArray();

        for(char c : chars) {
            if(Character.isUpperCase(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            } else {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }
        System.out.print(stringBuilder);
    }
}