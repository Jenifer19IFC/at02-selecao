import java.util.Scanner;
public class exer20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Digite um ano: ");
		int ano = input.nextInt();
		
		if (ano % 400 == 0)
			System.out.println(ano + " � um ano bixessto");
		else if ((ano % 4 == 0) && (ano % 100 != 0))
			System.out.println(ano + " � um ano bixessto");
		else
			System.out.println(ano + " n�o � um ano bixessto");
		
		input.close();
	}

}
