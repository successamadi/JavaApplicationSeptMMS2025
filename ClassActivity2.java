public class ClassActivity2{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Task 2");
		
		System.out.println("Enter a number");
		int num1 = input.nextInt();
		
		boolean isEven = (num1)%2 == 0;
		System.out.println("%d is an Even number? %b",num1,isEven);
		
		System.out.println("");
		System.out.println("===============================================");
	}
}