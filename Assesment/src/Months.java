import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		Scanner Key = new Scanner(System.in);
		System.out.print("enter the month name:");
		int month = Key.nextInt();
		
		switch(month){
		case  0:
			System.out.println("January");
			break;
		case 1:
			System.out.println("february");
			break;
		case 2:
			System.out.println("march");
			break;
		default:
			System.out.println("nothing is printed");
			break;
		}		

	
	}

}
