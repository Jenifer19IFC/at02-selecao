import java.util.Scanner;
public class exer1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num1 = input.nextInt();
		System.out.println("Digite outro n�mero: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) 
			System.out.println(num1 + " � maior");
		else if (num2 > num1)
			System.out.println(num2 + " � maior");
		else 
			System.out.println(num1 + " e "+ num2 +" s�o iguais");
	
		input.close();
	}

}

