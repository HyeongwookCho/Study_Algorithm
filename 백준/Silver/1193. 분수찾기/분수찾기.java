import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 X값
        int X = Integer.parseInt(br.readLine());
        // 해당 범위의 대각선 칸 개수
        int cross_count = 1;
        // 해당 대각선 직전 대각선까지의 칸의 누적 합
        int prev_count_sum = 0; // ex) 3번째 대각선 줄이면 prev_count_sum = 4 임 => 3/1, 2/2, 1.3 들의 분자 분모 합

        while (true) {
            // 직전 대각선 누적 합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) {
                if(cross_count % 2 == 1){ // 대각선의 개수가 홀수라면
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X 번째 - 직전 대각선까지의 블럭 개수
                    bw.write((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                } else{
                    bw.write((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }


        br.close();
        bw.flush();
        bw.close();
    }

}