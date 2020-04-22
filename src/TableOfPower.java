import java.util.Scanner;

public class TableOfPower {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		/* 1- Create a table of powers 
		 * 2- Have the user enter an integer
		 * 3-Display a table of squares and cubes from 1 to the value entered
		 * 4-Ask if the user wants to continue
		 * extended Challenge add multiplication table to the end. 
		 */

		boolean shouldContinue = true;
		while(shouldContinue) {  //we entered the boolean while loop as the parent of the Table of Power so we can ask from the end if they would like to continue
			//System.out.println(""); If you want a space after y/n question include this println command
			System.out.println("Learn your squares, cubes, and multiples!");
			System.out.print("Enter an integer: {user input here, for example: 5} ");

			int num = scnr.nextInt();

			int tableSize = num;

			System.out.println("");

			System.out.println(" Number     Squared     Cubed");
			System.out.println("=======     =======    =======");

			for(int i=1; i <= num ; i++) { 
				System.out.printf("%d %12d %10d\n", i , i * i , i * i *i);// changing the formula in the 2nd half will provide the correct math notice printf
			}

			System.out.println("");
			System.out.println(" Multiplication Table of Selection");
			System.out.println("");

			//int tableSize = num; this is initialized above with scanner to accept the value for num so that both tables use same number for calculation
			System.out.format("      ");
			for(int i = 1; i<=tableSize;i++ ) {
				System.out.format("%4d",i);
			}
			System.out.println();
			System.out.println("         =   =   =   =   =   =   =   =");

			for(int i = 1 ;i<=tableSize;i++) {
				// print left most column first
				System.out.format("%4d |",i);
				for(int j=1;j<=tableSize;j++) {
					System.out.format("%4d",i*j);
				}
				System.out.println();

			}


			//while(shouldContinue) {   copied and entered above to include block for continue y/n
			System.out.println("");
			System.out.print("Do you want to continue? (yes/no) ");
			//returns the next token from the scanner
			String response = scnr.next();
			shouldContinue = response.equals("yes"); // if response. equals true by "yes" this makes shouldContinue true and continues while loop use equalsIgnoreCase to accept "YES"
		}
		System.out.println("");
		System.out.print("Ok, Goodbye.");
	}
}

