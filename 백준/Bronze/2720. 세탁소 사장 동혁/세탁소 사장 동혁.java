import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int quarter = 25;
        int dime = 10;
        int nickel = 5;

        for (int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());
            int changeQuarter =  (change / quarter);
            int changeDime =  ((change % quarter) / dime);
            int changeNickel =  (((change % quarter) % dime) / nickel);
            int changePenny =  (((change % quarter) % dime) % nickel);

            bw.write(changeQuarter+" "+changeDime+" "+changeNickel+" "+changePenny);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
