 import java.util.Scanner;
public class V14_FactorialUsingRecursion {

	
 int fact(int n) {
	if(n==1)
		return 1;
	else 
		return (n*fact(n-1));//5*fact(4)
	                           //5*4*fact(3)
	                            // 5*4*3*fact(2)
	                             //5*4*3*2*1 = 120
	}

public static void main(String[] args) {
	System.out.println("enter the number");
V14_FactorialUsingRecursion	obj = new V14_FactorialUsingRecursion();
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();//5
System.out.println(obj.fact(n));//fact(5)

	}
}

