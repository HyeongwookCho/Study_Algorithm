import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 판정할 입력값 세팅
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 소수 판정하기
        for (int j = 0; j < N; j++) {
            if(isPrime(arr[j])) count++;
        }

        bw.write(Integer.toString(count));
        br.close();
        bw.flush();
        bw.close();
    }
    public static boolean isPrime(int num) {
        if(num == 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
