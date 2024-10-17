import java.util.Scanner;

public class U2_Leap_year_check{

	public static void main(String[] args) {
		System.out.println("Enter the year");
Scanner scanner =  new Scanner(System.in);
 int year = scanner.nextInt();
		 
if((year%4==0 && year%100!=0)||(year%400==0)){
	System.out.println("Leap year");
}
else {
	System.out.println("not a leap year");

}
	}
	  }

