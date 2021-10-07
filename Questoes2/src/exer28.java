import java.util.Scanner;
public class exer28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float resultF = 0;
		System.out.println("Digite um número:");
		float num1F = input.nextFloat();
		System.out.println("Digite outro número:");
		float num2F = input.nextFloat();
		System.out.println("Qual operação deseja realizar?");
		System.out.println("1- Adição; 2- Subtração; 3- Multiplicação; 4- Divisão.");
		int op = input.nextInt();
		
		if(op == 1)
			resultF = num1F+num2F;
		else if(op == 2)
			resultF = num1F-num2F;
		else if(op == 3)
			resultF = num1F*num2F;
		else if(op == 4)
			resultF = num1F/num2F;
		
		System.out.println("O resultado é " + resultF);
		
		if(resultF % 2 == 0)
			System.out.println("Ele é par.");
		else if (resultF % 2 != 0 )
			System.out.println("Ele é ímpar.");
		
		if(resultF > 0)
			System.out.println("E é positivo.");
		else if (resultF < 0)
			System.out.println("E é negativo.");
		
		if (resultF % 1 != 0)
			System.out.println("E também é decimal.");
			else 
				System.out.println("E também é inteiro.");
		
		input.close();
			
	}

}
