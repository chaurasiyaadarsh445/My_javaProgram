import java.util.Scanner;
public class V17_Prime_number {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number");
	int count=0,i,num  = scanner.nextInt();
	for(i=1;i<=num;i++) {  //7
		if(num%i==0)
		count++;//1
	}
	if(count==2)
		System.out.println("prime number");
	else
		System.out.println("not a prime number");

	}

}
