import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 기본적으로 나머지가 없이 딱 나눠 떨어지는 경우에는
        // 아래와 같이 (최종 길이 - 내려가야하는 길이) 를 하루 올라가는 길이로 나눠 몫을 구해주면 된다.
        int dayCount = (V - B) / (A - B);
        // 다만 위처럼 해도 나머지가 생기는 경우에은 하루 더 올라가는 날이 필요하기 때문에
        // dayCount++를 해준다.
        if ((V - B) % (A - B) != 0) {
            dayCount++;
        }

        bw.write(Integer.toString(dayCount));

        br.close();
        bw.flush();
        bw.close();
    }

}