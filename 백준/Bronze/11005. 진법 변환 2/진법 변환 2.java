import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //알파벳 대문자부터는 A : 65 ~ Z : 90
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Stack<Character> result = new Stack<Character>();

        while(N > 0){
            int quotient = N / B;
            int remainder = N % B;
            if(remainder < 10) remainder += '0';
            else remainder += 55;
            N = quotient;
            result.push((char) remainder);
        }

        int LoopCount = result.size();
        for (int i = 0; i < LoopCount; i++) {
            bw.write(result.pop());
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
