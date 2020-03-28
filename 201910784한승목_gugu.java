package report02;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int o = scan.nextInt();
		
		for(i = 1; i <= 9; i++ ) {
			System.out.println( o + " x " + i + " = " + o * i );
		}
		
		
	}

}
