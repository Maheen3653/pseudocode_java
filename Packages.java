import java.util.Scanner;
public class Packages{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of packages : ");
		int packages = input.nextInt();

		if(packages >= 10 && packages <= 19){
		double amount = (packages * 99) * 0.20;
		System.out.println("Amount is:$ " + amount);
		}
		else if(packages >= 20 && packages <= 49){
		double amount = (packages * 99) * 0.30;
		System.out.println("Amount is:$ " + amount);
		}
		else if(packages >= 50 && packages <= 99){
		double amount = (packages * 99) * 0.40;
		System.out.println("Amount is:$ " + amount);
		}
		else(packages >= 100){
		double amount = (packages * 99) * 0.50;
		System.out.println("Amount is:$ " + amount);
		}
		}
	}



		

