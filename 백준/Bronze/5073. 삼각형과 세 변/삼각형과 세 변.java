import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0) break;

            if (CheckTriangle(a, b, c)){
                bw.write("Invalid \n");
            } else if (a == b && b == c) {
                bw.write("Equilateral \n");
            } else if (a == b || b == c || a == c) {
                bw.write("Isosceles\n");
            } else if (a != b && b != c && a != c) {
                bw.write("Scalene\n");
            }  else {
                bw.write("Error\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
    private static boolean CheckTriangle(int a, int b, int c){
        int[] arr = new int[3];
        boolean result = true;
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);

        if (arr[2] < arr[0] + arr[1]) {
            result = false;
        }
        return result;
    }
}