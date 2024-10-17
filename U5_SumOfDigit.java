import java.util.*;
public class U5_SumOfDigit {

public static void main(String[] args) {
System.out.println("Enter the number which you want to add");
 Scanner scanner = new Scanner(System.in);
int sum=0, digit, num= scanner.nextInt();
while(num!=0) {//121
	digit = num%10;//1
	sum = sum+digit;//1
	num = num/10;//12
	}
System.out.println("sum of digit is: " +sum);
}	
}

