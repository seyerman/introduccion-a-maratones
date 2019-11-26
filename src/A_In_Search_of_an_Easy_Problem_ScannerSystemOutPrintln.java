import java.util.Scanner;

//codeforces.com
//https://codeforces.com/problemset/problem/1030/A
public class A_In_Search_of_an_Easy_Problem_ScannerSystemOutPrintln {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean easy = true;
		
		for (int i = 0; i < n; i++) {
			int currentAnswer = sc.nextInt();
			if(currentAnswer==1) {
				easy = false;
			}
		}
		
		if(easy) {
			System.out.println("EASY");
		}else {
			System.out.println("HARD");			
		}
		
		sc.close();
	}

}
