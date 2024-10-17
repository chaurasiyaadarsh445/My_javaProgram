import java.util.Scanner;
public class U9_ReverseANumber {
public static void main(String [] args) {
	System.out.println("Enter the number to reverse");
Scanner scanner = new Scanner(System.in);
int result =0, digit ,num = scanner.nextInt();
while(num!=0) {
	digit = num% 10;
	result = result*10+digit;
	num= num/10;
	
}
System.out.println("Reverse of the digit is: "+ result);
	
	
}

}


