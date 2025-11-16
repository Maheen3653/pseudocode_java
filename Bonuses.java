import java.util.Scanner;
public class Bonuses{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter years of service: ");
		int years = input.nextInt();
		
		if(years < 3){
		System.out.println("Not eligible for bonus");
		}
		
		System.out.println("Enter performance rating(1,2 or3) ");
		int rating = input.nextInt();

		if (rating == 3){
		System.out.println("Bonus:$10,000 ");
		}
		else if(rating == 2){
		System.out.println("Bonus:$5000 ");
		}
		else if(rating == 1){
		System.out.println("Bonus:$2000 ");
		}
		else {
		System.out.println("Invalid rating! Please enter 1,2 or3");
		}
		}
	}




		



