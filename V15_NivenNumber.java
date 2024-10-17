// niven number is something whose sum of digit itself divide the number
//eg- 12(2+1=3) 12%3==0
import java.util.Scanner;
public class V15_NivenNumber {
	
	public static void main(String[] args) {
		int sum = 0,digit=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number");
	int num= scanner.nextInt();
	 int temp=num;
	while(num!=0) {//202
		digit=num%10;//2,0,2
		sum = sum+digit;//2,2,4
		num = num/10;//20,2,0
	}	
	if (temp % sum==0) 
		System.out.println("NUMBER IS NIVEN ");
	
	else
		System.out.println("NOT NIVEN");
	
	

	}
	}
	


