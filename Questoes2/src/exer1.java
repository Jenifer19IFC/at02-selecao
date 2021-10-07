import java.util.Scanner;
public class exer1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = input.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = input.nextInt();
		
		if (num1 > num2) 
			System.out.println(num1 + " é maior");
		else if (num2 > num1)
			System.out.println(num2 + " é maior");
		else 
			System.out.println(num1 + " e "+ num2 +" são iguais");
	
		input.close();
	}

}

