import java.util.*;
public class V10_PallindromeNumber {
	//if reverse=original then pallindrome number

	public static void main(String[] args) {
	System.out.println("Type number to pallindrome check");
	Scanner scanner = new Scanner(System.in);
	int reverse=0,digit, num = scanner.nextInt();
	int temp=num;
	while(num!=0) {
		digit = num%10;
		reverse = reverse*10+digit;
		num = num/10;
		
	}
	
	if(temp==reverse) {
		System.out.println("given number is pallindrome");
	}
	else {
		System.out.println("not a pallindrome number");
	}
	}

}
