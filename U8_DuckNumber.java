import java. util.*;
public class U8_DuckNumber {
// duck number is something which having zero including
// eg- 1453609--duck number
//eg- 009876--not a duck number zero not should be at starting pt.
// eg- 7685--not a duck number
	public static void main(String[] args) {
	System.out.println("Enter the number for Duck check");
	Scanner scanner = new Scanner(System.in);
	int digit,num = scanner.nextInt();
	boolean isDuckNumber = false;
	while(num!=0) {
		digit = num%10;
		if(digit == 0) {
			isDuckNumber = true;
		break;
		}
		num= num/10;
			}
	if(isDuckNumber) {
		System.out.println("Number is a duck number");
	}
	else {
		System.out.println("not a duck number");
	}
	scanner.close();

	}

}
