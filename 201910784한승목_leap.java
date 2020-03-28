package report02;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도입력 : ");
		int year = scan.nextInt();
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println(year + "년, 윤년");
		}
		else {
			System.out.println(year + "년, 평년");
		}
	}

}
