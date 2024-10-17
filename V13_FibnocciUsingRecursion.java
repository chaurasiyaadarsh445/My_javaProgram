import java.util.Scanner;
public class V13_FibnocciUsingRecursion {

	int fibo (int n) {
		if(n==0 || n==1)
		return n;
		else
			return fibo(n-1)+fibo(n-2);
	}		
public static void main(String[] args) {
System.out.println("enter the number ");
V13_FibnocciUsingRecursion obj= new V13_FibnocciUsingRecursion();
Scanner scanner = new Scanner(System.in);
int x = scanner.nextInt();
System.out.println("fibonacci series");
for(int i=0;i<=x;i++)
System.out.print(obj.fibo(i)+" , ");
	}
}
