import java.util.Scanner;
class Month{
	public static void main(String[] args){
		Scanner e = new Scanner(System.in);
		
		
		System.out.println("Enter the Number ");
		System.out.println("1:");
		System.out.println("2:");
		System.out.println("3:");
		System.out.println("4:");
		System.out.println("5:");
		System.out.println("6:");
		System.out.println("7:");
		System.out.println("8:");
		System.out.println("9:");
		System.out.println("10:");
		System.out.println("11:");
		System.out.println("12:");
		System.out.println("Choose from 1 to 12 ");
		
		int choice = e.nextInt();
		
		
		switch(choice){
			
			case 1:
			System.out.println("Jaunuary");
			break;
			case 2:
			System.out.println("February");
			break;
			case 3:
			System.out.println("March");
			break;
			case 4:
			System.out.println("April");
			break;
			case 5:
			System.out.println("May");
			break;
			case 6:
			System.out.println("June");
			break;
			case 7:
			System.out.println("July");
			break;
			case 8:
			System.out.println("August");
			break;
			case 9:
			System.out.println("September");
			break;
			case 10:
			System.out.println("October");
			break;
			case 11:
			System.out.println("November");
			break;
			case 12:
			System.out.println("December");
			break;
			default:
			System.out.println("Invalid operator selection");
		}
	}
}