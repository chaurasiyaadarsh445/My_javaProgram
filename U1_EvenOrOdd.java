
import java.util.*;

public class U1_EvenOrOdd {

	public static void main(String[] args) {
	System.out.println("Enter a number");
  try(Scanner scanner = new Scanner(System.in);){
  int num = scanner.nextInt();
  if(num<0) {
	  System.out.println("invalid number "+num);
  }
  else {
	  if(num%2==0) {
		  System.out.println("Even number");
	  }
  
  else {
	  System.out.println("odd");
  }
	}

      }
	    }
          }
