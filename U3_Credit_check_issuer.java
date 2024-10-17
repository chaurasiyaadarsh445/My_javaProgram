import java.util.*;
public class U3_Credit_check_issuer {


	public static void main(String[] args) {
		System.out.println("Enter the card credit score");
	   Scanner scanner  = new Scanner(System.in);
	 int score  = scanner.nextInt();
	 if(score<400 && score>850) {
		 System.out.println("Invalid card");
	 }
	 else {
		 if(score >400 && score<600) {
			 System.out.println("Silver card");
		 }
		 else if(score>600 && score<800) {
			 System.out.println("Gold card");
		 }
		 else if(score> 800 && score<850) {
			 System.out.println("Platinum card");
		 }
	       }
		 
	          }
	
	             }

	
