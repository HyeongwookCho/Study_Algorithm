import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] degree = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            degree[i] = Integer.parseInt(st.nextToken());
        }
        int sum = degree[0] + degree[1] + degree[2];
        if(degree != null){
            if(degree[0] == 60 && degree[1] == 60 && degree[2] == 60){
                bw.write("Equilateral");
            } else if ((sum == 180) && (degree[0] == degree[1] || degree[0] == degree[2] || degree[1] == degree[2])) {
                bw.write("Isosceles");
            } else if ((sum == 180) && (degree[0] != degree[1] && degree[0] != degree[2] && degree[1] != degree[2])) {
                bw.write("Scalene");
            } else if (sum != 180){
                bw.write("Error");
            }
        }


        br.close();
        bw.flush();
        bw.close();
    }
}