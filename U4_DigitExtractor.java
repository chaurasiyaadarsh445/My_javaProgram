import java.util.Scanner;

public class U4_DigitExtractor {

	public static void main(String[] args) {
		System.out.println("enter the number");
	Scanner scanner = new Scanner(System.in);
	int digit,num = scanner.nextInt();
	while(num!=0)
	{
	digit= num % 10;
	System.out.print(digit+" ");
		num = num / 10;
		
	}
}
	}
