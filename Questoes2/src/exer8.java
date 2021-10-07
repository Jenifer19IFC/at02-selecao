import java.util.Scanner;
public class exer8 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");  
		float nota1F = input.nextFloat(); 
		System.out.println("Digite a segunda nota: ");
		float nota2F = input.nextFloat();
		
		float mediaF = (float) ((nota1F + nota2F) / 2);
		
		if(mediaF >= 7)
			System.out.println("Aprovado!");
		else 
			System.out.println("Reprovado!");
		
		input.close();
	}

}
