import java.util.Scanner;		
public class exer26 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Digite um n�mero inteiro:");
		int num = input.nextInt();
		
		if(num % 2 == 0)
			System.out.println("N�mero par:");
		else if(num % 2 != 0)
			System.out.println("N�mero �mpar.");
		
		input.close();
	}

}
