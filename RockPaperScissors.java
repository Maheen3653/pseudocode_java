import java.util.Scanner;
public class RockPaperScissors{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
		int ComputerChoice = (int)(Math.random() * 3);
		System.out.println("ComputerChose: " + ComputerChoice);

		System.out.print("Enter your choice (0 for Scissor, 1 for Rock, 2 for Paper): ");
		int userChoice = input.nextInt();
		System.out.print("You chose: " + userChoice);

		if(userChoice == ComputerChoice){
		System.out.print("Its a draw");
		}
		else if((userChoice == 0 && ComputerChoice == 2) || (userChoice == 1 && ComputerChoice == 0) || (userChoice == 2 && ComputerChoice == 1)){
		System.out.print("You win!");
		}
		else{
		System.out.print("Computer wins!");
		}
		}
	}


		

