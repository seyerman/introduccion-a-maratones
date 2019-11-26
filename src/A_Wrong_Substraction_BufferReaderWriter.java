import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//codeforces.com
//https://codeforces.com/problemset/problem/977/A
public class A_Wrong_Substraction_BufferReaderWriter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		String[] parts = line.split(" ");
		
		int n = Integer.parseInt(parts[0]);
		int k = Integer.parseInt(parts[1]);
		
		for (int i = 0; i < k; i++) {
			if(n%10==0) {
				n = n/10;
			}else {
				n = n-1;
			}
		}
		
		bw.write(n+"\n");
		
		br.close();
		bw.close();
	}

}
