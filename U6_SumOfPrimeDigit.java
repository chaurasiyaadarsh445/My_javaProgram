import java. util.*;
public class U6_SumOfPrimeDigit {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int sum=0,digit,num = scanner.nextInt();
		while(num!=0) {
			digit= num%10;
			if(digit==2||digit==3 || digit==5 || digit==7) {
				sum = sum+ digit;
				
			}
			num = num/10;
			
		}
		System.out.println("sum of prime number is: "+sum);
       scanner.close();
	}

}
