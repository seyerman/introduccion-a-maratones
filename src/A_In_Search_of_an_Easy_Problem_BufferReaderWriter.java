import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//codeforces.com
//https://codeforces.com/problemset/problem/1030/A
public class A_In_Search_of_an_Easy_Problem_BufferReaderWriter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] parts = br.readLine().split(" ");
		
		boolean easy = true;
		for (int i = 0; i < n; i++) {
			int currentAnswer = Integer.parseInt(parts[i]);
			if(currentAnswer==1) {
				easy = false;
			}
		}
		
		if(easy) {
			bw.write("EASY\n");
		}else {
			bw.write("HARD\n");			
		}
		
		br.close();
		bw.close();
	}

}
