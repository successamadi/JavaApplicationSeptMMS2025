import java.util.Scanner;

public class ClassActivity{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter our first number: ");
		short num1 = input.nextShort();
		
		System.out.print("Enter your second number: ");
		short num2 = input.nextShort();
		
		System.out.print("Enter your third number: ");
		short num3 = input.nextShort();
		
		System.out.print("Enter your fourth number: ");
		short num4 = input.nextShort();
		
		System.out.print("Enter your fifth number: ");
		short num5 = input.nextShort();
		
		System.out.println("");
		
		int addition = num1 + num2 + num3 + num4 + num5;		
		int average = addition / 5;
		int product = num1 * num2 * num3 * num4 * num5;	
		
		System.out.printf("Sum of %d, %d, %d, %d, %d = %d%n",num1,num2,num3,num4,num5,addition);
		System.out.printf("the average of %d, %d, %d, %d, %d = %d%n",num1,num2,num3,num4,num5,average);
		System.out.printf("product of %d, %d, %d, %d, %d = %d%n",num1,num2,num3,num4,num5,product);
		
		System.out.println("");
		System.out.println("===============================================");
	}
}	
		