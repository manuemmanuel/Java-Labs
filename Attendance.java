/***********************************************************************************************************************************
 * File          :  Attendance.java
 * Description   :  Assigning marks for attendance percentage
 * Author        :  Manu Emmanuel
 * Version       :  1.0
 * Date          :  26/09/2023
 **********************************************************************************************************************************/

import java.util.Scanner;
public class Attendance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int attendance,marks;
		System.out.println("Enter the attendance percentage: ");
		attendance = scan.nextInt();
		if (attendance >= 90 && attendance <= 100) {
			marks = 10;
			System.out.println("The marks awarded: "+marks);
		}
		else if (attendance >= 80 && attendance < 90) {
			marks = 8;
			System.out.println("The marks awarded: "+marks);
		}
		else if (attendance >=70 && attendance < 80) {
			marks = 7;
			System.out.println("The marks awarded: "+marks);
		}
		else if (attendance >= 60 && attendance < 70) {
			marks = 6;
			System.out.println("The marks awarded: "+marks);
		}
		else if (attendance < 60) {
			marks = 5;
			System.out.println("The marks awarded: "+marks);
		}
		else {
			System.out.println("Not Enough to avail marks.");
		}
	}
}
