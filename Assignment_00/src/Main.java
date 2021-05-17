import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(" /$$$$$$$     /$$$$$                         /$$$$$ /$$$$$$$  /$$$$$$$$        /$$       /$$");
		System.out.println("| $$__  $$   |__  $$                        |__  $$| $$__  $$|__  $$__/       | $$      | $$");
		System.out.println("| $$  \\ $$      | $$                           | $$| $$  \\ $$   | $$  /$$$$$$ | $$$$$$$ | $$  /$$$$$$");
		System.out.println("| $$$$$$$       | $$	    /$$$$$$            | $$| $$$$$$$/   | $$ |____  $$| $$__  $$| $$ /$$__  $$");
		System.out.println("| $$__  $$ /$$  | $$       |______/       /$$  | $$| $$____/    | $$  /$$$$$$$| $$  \\ $$| $$| $$$$$$$$");
		System.out.println("| $$  \\ $$| $$  | $$                     | $$  | $$| $$         | $$ /$$__  $$| $$  | $$| $$| $$_____/");
		System.out.println("| $$$$$$$/|  $$$$$$/                     |  $$$$$$/| $$         | $$|  $$$$$$$| $$$$$$$/| $$|  $$$$$$$");
		System.out.println("|_______/  \\______/                       \\______/ |__/         |__/ \\_______/|_______/ |__/ \\_______/");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		int input;
		
		do {
			System.out.println(" ");
			System.out.println("[1] Start the simulation!!");
			System.out.println("[2] Close App");
			System.out.printf("Choice >> ");
			input = scan.nextInt();
			scan.nextLine();
			System.out.println(" ");
		
			int a, b;
			if(input == 1) {
				do {
					System.out.print("Input the first number [1 - 100](inclusive): ");
					a = scan.nextInt();
					scan.nextLine();
					
				} while(a < 1 || a > 100);
				
				
				do {
					System.out.print("Input the second number [1 - 100](inclusive): ");
					b = scan.nextInt();
					scan.nextLine();
				} while(b < 1 || b > 100);
				
				String isString = a + " + " + b;
				char A = (char)a;
				char B = (char)b;
				Integer isInteger = a * b;
				float isFloat = (float) (Math.round((float)a / (float)b * 1000) / 1000.0);
				String result = (a == b) ? "True" : "False";
				
//				-- DATA TYPES -- 
				System.out.println("+=========================================================================================================================+");
				System.out.println("+  + (String type)  |  (Character Type)  |  * (Integer type)  |  / (Floating Type)  |  input 1 == input 2 (Boolean Type)  +");
				System.out.println("+=========================================================================================================================+");
				System.out.println("+      " + isString + "      |       " + A + "   " + B + "        |          " + isInteger + "      |          " + isFloat + "      |                " + result + "                +");
				System.out.println("+=========================================================================================================================+");
				System.out.print("Press enter to proceed..");
				scan.nextLine();
				System.out.println(" ");
				
				int aPlusB = a + b;
				int aMinB = a - b;
				int aTimesB = a * b;
				int aDividedB = a / b;
				int aModuloB = a % b;
				
//				-- BASIC ARITHMETIC OPERATION --
				System.out.println("+=====================================================================+");
				System.out.println("+Data Type : Integer                                                  +");
				System.out.println("+=====================================================================+");
				System.out.println("+      +      |      -      |      *      |      /      |      %      +");
				System.out.println("+=====================================================================+");
				System.out.println("+     " + aPlusB + "     |       " + aMinB + "     |    " + aTimesB + "     |      " + aDividedB + "      |      " + aModuloB + "      +");
				System.out.println("+=====================================================================+");
				System.out.print("Press enter to proceed..");
				scan.nextLine();
				System.out.println(" ");
				
//				-- BOOLEAN --
				String value1, value2;
				do {
					System.out.print("Give me value for p1 [true | false]: ");
					value1 = scan.next();
					if(value1.equals("true") || value1.equals("false")) {
						break;
					}
				} while(!value1.equals("true") || !value1.equals("false"));
				
				do {
					System.out.print("Give me value for p2 [true | false]: ");
					value2 = scan.next();
					if(value1.equals("true") || value1.equals("false")) {
						break;
					}
				} while(!value1.equals("true") || !value1.equals("false"));
				
				char p1 = (value1.equals("true")) ? 'T' : 'F';
				char p2 = (value2.equals("true")) ? 'T' : 'F';
				boolean b1 = (value1.equals("true")) ? true : false;
				boolean b2 = (value2.equals("true")) ? true : false;
				
				System.out.println(" ");
				System.out.println("+=====================================================================+");
				System.out.println("+ Logical Table                                                       +");
				System.out.println("+=====================================================================+");
				System.out.println("+ P1 = " + p1 + " , " + "P2 = " + p2 + "                              +");
				System.out.println("+=====================================================================+");
				System.out.println("+       !P1       |       !P2       |       &&       |       ||       +");
				System.out.println("+=====================================================================+");
				System.out.println("+      " + !b1 + "      |      " + !b2 + "       |     " + (b1 && b2) + "      |      " + (b1 || b2) + "      +");
				System.out.println("+=====================================================================+");
				System.out.println(" ");
			} 
			
		} while(input != 2);
		
		System.out.println("thank you for using the apps!!");
	}

}
