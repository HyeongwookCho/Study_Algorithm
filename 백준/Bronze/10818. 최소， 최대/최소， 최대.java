import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<>();
        int max = -2147000000;
        int min = 2147000000;

        int t = Integer.parseInt(br.readLine());
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        for(int i = 0; i < t; i++)
        {
            al.add(Integer.parseInt(st.nextToken()));
        }
        for(int j = 0; j < al.size(); j++)
        {
            if(al.get(j) > max) max = al.get(j);
            if(al.get(j) < min) min = al.get(j);
        }

        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }
}
