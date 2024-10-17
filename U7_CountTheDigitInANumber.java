import java. util.*;
public class U7_CountTheDigitInANumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
    int count=0,num = scanner.nextInt();
    while(num!=0) {
    num = num/10;
    count = count +1;
	}
	System.out.println("number of digit is: "+count);
	}
	 }

