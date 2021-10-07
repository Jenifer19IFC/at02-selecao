import java.util.Scanner;
public class exer4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um ano com 4 dígitos: ");
		int ano = input.nextInt();
		
		if (ano % 400 == 0)
			System.out.println(ano + " é um ano bissexto");
		else if ((ano % 4 == 0) && (ano % 100 != 0))
			System.out.println(ano + " é um ano bixessto");
		else
			System.out.println(ano + " não é um ano bixessto");
		
		input.close();
	}

}
