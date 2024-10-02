import java.util.Scanner;

class input {
	public static void main(String[] args) {
	
	    Scanner Input = new Scanner(System.in);
	    
		System.out.println("Enter a number:");
		int num = Input.nextInt();
		
		System.out.print("Here is your number:" +num);
		
		Input.close();
	}
}