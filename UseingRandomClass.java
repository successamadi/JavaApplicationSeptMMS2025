import java.util.Random;


public class UseingRandomClass{
	public static void main (String[] args){
		Random random = new Random();
		
		int generatedint = random.nextInt();
		System.out.printf("The generated number is %d%n",Math.abs(generatedInt));
	}
}