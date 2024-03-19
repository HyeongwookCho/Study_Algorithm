import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값 구성
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }

        int result = search(cards, N, M);

        bw.write(Integer.toString(result));

        br.close();
        bw.flush();
        bw.close();
    }
    private static int search(int[] cards, int N, int M) {
        int maxSum = 0;
        // nC3 경우의 수임.
        // 3개 수의 합이 M보다 작거나 같을 때 까지 반복하는데
        // 모든 경우의 수를 대조해보며 최대값을 찾는다.
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum > maxSum && sum <= M) {
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }
}