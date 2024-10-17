import java.util.Scanner;
public class V18_PERFECT_NUMBER {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number");
	int num= scanner.nextInt();
	int digit,sum=0,product=1;
	while(num!=0) {
		digit=num%10;
		sum=sum+digit;
		product = product*digit;
		num=num/10;	
	}
	if(sum==product)
		System.out.println("SPECIAL NUMBER");
	else
		System.out.println("NOT A SPECIAL NUMBER");

	}

}
