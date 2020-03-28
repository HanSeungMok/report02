package report02;

import java.util.Scanner;

public class leap_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, i = 1;
	
		Scanner scan = new Scanner(System.in);
		
		do {
		
		System.out.print("년도입력 : ");
		year = scan.nextInt();
		
		if(year < 0) {
			System.out.println("종료");
			i = 0;
		}
		else {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("윤년");
			}
			else {
				System.out.println("평년");
			}
		}
		
		}
		
		while(i !=0);

	}

}
