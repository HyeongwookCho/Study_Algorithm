import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < 9; i++)
        {
            al.add(Integer.parseInt(br.readLine()));
        }
        for(int j = 0; j < al.size(); j++)
        {
            if(al.get(j) > max)
            {
                max = al.get(j);
                count = al.indexOf(max)+1;
            }
        }

        bw.write(max + "\n" + count);

        br.close();
        bw.flush();
        bw.close();
    }
}
