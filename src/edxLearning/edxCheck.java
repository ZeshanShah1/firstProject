package edxLearning;
import java.util.Scanner;

public class edxCheck {

	public edxCheck() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter value in Celceious: ");
		int celciousTemp = input.nextInt();
		input.nextLine();
		System.out.print("Enter Month, Day, and Year: ");
		
		String Date = input.nextLine();
		Double farhenhight =  (5.0/9) * (celciousTemp - 32);
		System.out.println(Date);
		System.out.println(farhenhight);
	}

}
