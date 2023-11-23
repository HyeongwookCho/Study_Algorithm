import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		String line = br.readLine();
		
		StringTokenizer st = new StringTokenizer(line);
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		String line2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(line2);
		
		for(int i = 0; i < N; i++)
		{		
			int current = Integer.parseInt(st2.nextToken());
			if(X > current)
			{
				bw.write(current + " ");
			}						
							
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
