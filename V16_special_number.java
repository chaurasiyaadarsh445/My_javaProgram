import java.util.Scanner;
public class V16_special_number {

	public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("enter the number");
int product=1, sum=0,digit,num = scanner.nextInt();
int temp=num;
while(num!=0) {// 123
digit = num%10;//3,2
  sum = sum+digit; //3
  product = product*digit;//3
  num = num/10;//12
  }
	int result= sum+product;
if(result==temp)
	System.out.println("special number");
else
	System.out.println("not a spl number");
}
}
