public class ClassActivity3{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		string name = input.nextLine();
		
		System.out.println("Enter your age: ");
		byte age = input.NextByte();
		
		System.out.println("Enter your address: ");
		short addy = input.NextLine();
		
		System.out.println("");
		System.out.println("info on %s%n",name);
		System.out.println("==================================");
		
		System.out.println("%s is %d yeas old%n",name,age);
		System.out.println("This individual stays at %s%n",addy);
    }
		
	}