import java.util.*;
public class V10_2nd_WayToCheckPallindrome {

	public static void main(String[] args) {
	Scanner scanner	= new Scanner(System.in);
	System.out.println("Type number to pallindrome check");
	 String  num = scanner.next();
	 StringBuffer sb  = new StringBuffer(num);
	 //StringBuffer containing reverse method
	 String reverseNumber = sb.reverse().toString();
	 System.out.println(num.equals(reverseNumber)? "pallindrome": "not a palindrome");
	}

	
	}


