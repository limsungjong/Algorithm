import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        // 상자의 갯수를 미리 구함 사과 / 상자에 들어갈 갯수
        int maxBoxLength = score.length / m;
        // 답변으로 사용할 box 개수 위에서 만든 갯수 만큼 공간을 만듬
        int[] box = new int[maxBoxLength];
        // 박스 번호 라고 생각하면 됨
        int idx = 0;
        // 최저 값 10부터 하나씩 줄여감
        int min = 10;
        // 먼저 score로 들어올 사과 갯수 크기의 for선언 1바퀴마다 상자에 들어갈 사과 갯수만큼 줄어듬
        // ex) score.length 1,000,000까지임, m이 5라면 1바퀴 돌면 i = 999,995가 될것임
        for (int i = score.length - 1; i >= m-1; i -= m) {
            // j는 i, j 가 i - m 보다 크면 멈춤, j는 계속 빠짐
            // 즉,for문이 여기에 있는게 돌고나면 가장 낮은 min값을 가지고 나가게 됨
            for (int j = i; j > i - m; j--) {
                min = Math.min(min, score[j]);
            }
            box[idx++] = min * m;
        }
        return Arrays.stream(box).sum();
    }
}