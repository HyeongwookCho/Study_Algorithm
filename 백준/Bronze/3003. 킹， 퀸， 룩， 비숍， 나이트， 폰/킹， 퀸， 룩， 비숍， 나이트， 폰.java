import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] mychess = new int[chess.length];
        String input = br.readLine();
        br.close();
        
        for (int i = 0; i < chess.length; i++) {
            String[] mychessstr = input.split(" ");
            mychess[i] = Integer.parseInt(mychessstr[i]);
        }
        for (int j = 0; j < mychess.length; j++) {
            mychess[j] = chess[j] - mychess[j];
            bw.write(Integer.toString(mychess[j])+" ");
        }

        bw.flush();
        bw.close();
    }
}
