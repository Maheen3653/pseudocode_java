import java.util.Scanner;
public class CheckNumber{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int Number = input.nextInt();
	
		if(Number > 0){
		System.out.println("The number is positive");
		if(Number % 2 == 0){
		System.out.println("It is an even number");
		}
		else{
		System.out.println("It is an odd number");
		}
		}
	}
}


 


