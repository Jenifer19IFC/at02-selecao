import java.util.Scanner;
public class exer16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");  
		float nota1F = input.nextFloat(); 
		System.out.println("Digite a segunda nota: ");
		float nota2F = input.nextFloat();
		
		float mediaF = (float) ((nota1F + nota2F) / 2);
		
		if((mediaF >= 0) && (mediaF < 3))
			System.out.println("Reprovado!");
		else if((mediaF >= 3) && (mediaF <= 6.9))
			System.out.println("Em exame!");
		else if((mediaF >= 7) && (mediaF <= 10))
			System.out.println("Aprovado!");
		
		input.close();

	}

}
