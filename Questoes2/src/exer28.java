import java.util.Scanner;
public class exer28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float resultF = 0;
		System.out.println("Digite um n�mero:");
		float num1F = input.nextFloat();
		System.out.println("Digite outro n�mero:");
		float num2F = input.nextFloat();
		System.out.println("Qual opera��o deseja realizar?");
		System.out.println("1- Adi��o; 2- Subtra��o; 3- Multiplica��o; 4- Divis�o.");
		int op = input.nextInt();
		
		if(op == 1)
			resultF = num1F+num2F;
		else if(op == 2)
			resultF = num1F-num2F;
		else if(op == 3)
			resultF = num1F*num2F;
		else if(op == 4)
			resultF = num1F/num2F;
		
		System.out.println("O resultado � " + resultF);
		
		if(resultF % 2 == 0)
			System.out.println("Ele � par.");
		else if (resultF % 2 != 0 )
			System.out.println("Ele � �mpar.");
		
		if(resultF > 0)
			System.out.println("E � positivo.");
		else if (resultF < 0)
			System.out.println("E � negativo.");
		
		if (resultF % 1 != 0)
			System.out.println("E tamb�m � decimal.");
			else 
				System.out.println("E tamb�m � inteiro.");
		
		input.close();
			
	}

}
