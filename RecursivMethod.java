public class RecursivMethod{
	public static void main (String[] args){
		displayName();
	}
	public static void displayName(){
		String name = "John Doe";
		System.out.printf("Youe name is %s%n",name);
		displayName();
	
	}
}