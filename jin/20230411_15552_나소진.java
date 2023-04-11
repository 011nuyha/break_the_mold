package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String cnt = br.readLine();
		int a = Integer.parseInt(cnt);
				
		for(int i=0; i<a; i++) {
			String num = br.readLine();
			StringTokenizer st = new StringTokenizer(num);
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			buf.write(String.valueOf(b + c));
			buf.write(String.valueOf("\n"));
		}
		
		buf.flush();
	}
}

