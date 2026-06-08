public class InstanceMethodInJava{
	
	public static void main (String[] args){
		InstanceMethodInJava instanceMethod = new InstanceMethodInJava();
		int sum = instanceMethod.add(70,50,80);
	
		System.out.printf("The sum of all the numbers is %d%n",sum);
		
		
	}
	public int add(int num1, int num2, int num3 ){

		int sum = num1 + num2 + num3;
		return sum;
	}
}