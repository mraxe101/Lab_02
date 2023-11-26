import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the 1st number ");
		int num1 = e.nextInt();
		System.out.println("Enter the 2nd number ");
		int num2 = e.nextInt();
		
		System.out.println("Enter the operator ");
		System.out.println("1: Addition + ");
		System.out.println("2: Subtraction - ");
		System.out.println("3: Multiplication ");
		System.out.println("4: Division / ");
		System.out.println("5: Modulus % ");
		System.out.println("Choose from 1 to 5 ");
		
		int choice = e.nextInt();
		double result = 0;
		
		switch(choice){
			case 1:
			result= num1+num2;
			System.out.println("Addition of num1 and 2 is "+ result);
			break;
			case 2:
			result = num1-num2;
			System.out.println("Subtraction of num1 and num2 is "+ result);
			break;
			case 3:
			result = num1*num2;
			System.out.println("Multiplication of num1 and num2 is "+ result);
			break;
			case 4:
			if(num2 !=0){
				result = num1/num2;
				System.out.println("Division of num1 and num2 is "+ result);
			}else
				System.out.println("Division by 0 is not allowed");
			break;
			case 5:
			if(num2 !=0){
				result = num1%num2;
				System.out.println("Modulus of num1 and num2 is "+ result);
			}else
				System.out.println("MOdulus with 0 is not allowed "+ result);
			break;
			default:
			System.out.println("Invalid operator selection");
		}
	}
}