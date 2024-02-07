import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {

            int sum = 0;
            ArrayList<Integer> divisor = new ArrayList<Integer>();
            int N = Integer.parseInt(br.readLine());

            if (N == -1) {
                break;
            } else {
                for (int i = 1; i < N; i++) {
                    if (N % i == 0) {
                        divisor.add(i);
                    }
                }
                for (int ii = 0; ii < divisor.size(); ii++) {
                    sum += divisor.get(ii);
                }
                if (sum == N) {
                    bw.write(Integer.toString(N)+ " = ");
                    for (int j = 0; j < divisor.size(); j++) {
                        if (j < divisor.size() - 1) {
                            bw.write(Integer.toString(divisor.get(j)) + " + ");
                        } else {
                            bw.write(Integer.toString(divisor.get(j)));
                        }

                    }
                }else{
                    bw.write(Integer.toString(N) + " is NOT perfect.");
                }
            }
            bw.newLine();
        }


        br.close();
        bw.flush();
        bw.close();
    }

}
