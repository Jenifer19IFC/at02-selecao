import java.util.Scanner;
public class exer10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maior, menor;
		System.out.println("Digite um número:");
		int a =  input.nextInt();
		System.out.println("Digite outro número:");
		int b =  input.nextInt();
		System.out.println("Digite mais um número:");
		int c =  input.nextInt();
		
		if((a >= b) && (b >= c))
			maior = a;
		else if ((b >= a) && (a >= c))
			maior = b;
		else
			maior = c;
		
		if((a <= b) && (b <= c))
			menor = a;
		else if ((b <= a) && (a <= c))
			menor = b;
		else
			menor = c;
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);		
		
		input.close();
	}

}
