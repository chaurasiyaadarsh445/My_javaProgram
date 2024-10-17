import java.util.Scanner;
public class V12_Fibnocci_series {

	public static void main(String[] args) {
		System.out.println("enter the fibo term you want");
Scanner scanner = new Scanner(System.in);
 int i, a=0,b=1,c,fibo = scanner.nextInt();
 
 
 for(i=1;i<fibo;i++) {        //1<5,2<5,3<5,4<5,
	 System.out.println(a);  //0 ,1,1,2
	 c=a+b; //1 //2,3,4
	 a=b;   //a=1,1,2,3
	 b=c;   // b=1,2,3,4
 }
	}

}
