import java.util.scanner;


public class DayOfWeek{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter day from 1 - 7");
		int day = in.nextInt();
		
		switch(day){
			case 1:
				System.out.println("The day entered is monday");
			break;
			
			case 2:
				System.out.println("The day entered is Tuesday");
			break;
			
			case 3:
				System.out.println("The day entered is Wednesday");
			break;
			
			case 4:
				System.out.println("The day entered is Thursday");
			break;
			
			case 5:
				System.out.println("The day entered is Friday");
			break;
			
			case 6:
				System.out.println("The day entered is Saturday");
			break;
			
			case 7:
				System.out.println("The day entered is Sunday");
			break;
		}

	}
}