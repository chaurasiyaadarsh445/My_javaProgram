import java.util.Scanner;
public class V11_IntegerToBinary {

	public static void main(String[] args) {
	System.out.println("Enter the integer");
	Scanner scanner = new Scanner(System.in);
	 int quot, num = scanner.nextInt();
	int temp = num;
	String b=" ";
    while(num>0) {  //9
	    num= num/2;  //4,2,1  	                           	   
	    temp =temp % 2;//1001	   
	    b = temp+ b;//1001
	    temp=num;//4210
	    	 }
 System.out.println(b);   
	}

}
