import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        int sum = 0;
        for (; N <= M; N++) {
            if (isPrime(N)) {
                primeList.add(N);
                sum += N;
            }
        }
        if(sum == 0) bw.write(Integer.toString(-1));
        else{
            bw.write(Integer.toString(sum)+"\n");
            bw.write(Integer.toString(primeList.get(0)));
        }

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
