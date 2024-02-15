import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                sb.append(i + "\n");
                N /= i;
            }
        }
        if (N > 1) {
            sb.append(N + "\n");
        }

        /*
        int prime = 2;
        while (N > 1) {
            if (N % prime == 0) {
                sb.append(prime + "\n");
                N = N / prime;
            } else {
                prime = getNextPrimeNum(prime);
            }
        }
        */
        bw.write(sb.toString());
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
    public static int getNextPrimeNum(int num) {
        int count = num;
        while (true) {
            count++;
            if(isPrime(count)){
                return count;
            }
        }
    }

}
