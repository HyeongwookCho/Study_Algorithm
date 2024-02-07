import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> divisor = new ArrayList<Integer>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisor.add(i);
            }
        }
        // 약수는 작은 크기 -> 큰 크기 순서대로 쌓임
        // 즉 몇 번째로 작느냐 ==> 왼쪽에서부터 몇 번째 index임? 이다.
        if(K <= divisor.size()){
            bw.write(Integer.toString(divisor.get(K-1)));
        }else{
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
