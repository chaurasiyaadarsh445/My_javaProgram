//ARMSTRONG NUMBER is somthing whose some of cube of digit is = original number
//eg-153== 1+125+27
import java.util.Scanner;
public class V19_Armstrong_number {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("enter the number");
int num = scanner.nextInt();
int digit,sum=0 ,cube;
int temp=num;
while(num!=0) {
	digit = num%10;
	cube = digit*digit*digit;
	sum = sum+cube;
	num=num/10;
}
if(sum==temp)
	System.out.println("Armstrong number");
else
	System.out.println("not an Armstrong number");

	}

}
