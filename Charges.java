import java.util.Scanner;
public class Charges{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight: ");
		int weight = input.nextInt();

		if( weight <= 2){
		double shippingCharges = weight * 1.10;
		System.out.println("Shipping charges are: $ " + shippingCharges);
		}
		else if(weight > 2 && weight <= 6){
		double shippingCharges = weight * 2.20;
		System.out.println("Shipping charges are: $ " + shippingCharges);
		}
		else if(weight > 6 && weight <= 10){
		double shippingCharges = weight * 3.70;
		System.out.println("Shipping charges are: $ " + shippingCharges);
		}
		else{
		double shippingCharges = weight * 3.80;
		System.out.println("Shipping charges are: $ " + shippingCharges);
		}
		}
	}



