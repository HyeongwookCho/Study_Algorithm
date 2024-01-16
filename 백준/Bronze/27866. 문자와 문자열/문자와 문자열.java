import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int count = Integer.parseInt(br.readLine());
        br.close();

        String arr[] = s.split("");

        bw.write(arr[count-1]);

        bw.flush();
        bw.close();
    }
}