import java.util.Scanner;
public class exer27 {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
	
		System.out.println("Digite um número: ");
		float numF = input.nextFloat();
		
		if (numF % 1 != 0)
		System.out.println("É decimal.");
		else 
			System.out.println("É inteiro.");
		
		input.close();
	}

}
