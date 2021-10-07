import java.util.Scanner;
public class exer24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		float nota1F = input.nextFloat();
		System.out.println("Digite a outra nota:");
		float nota2F = input.nextFloat();
		System.out.println("Digite mais uma nota:");
		float nota3F = input.nextFloat();
		
		float mediaF = ((nota1F+nota2F+nota3F)/3);
		
		if((mediaF >= 7) && (mediaF != 10))
			System.out.println("Aprovado com a média " + mediaF);
		else if(mediaF < 7)
			System.out.println("Reprovado com a média " + mediaF); 
		else if(mediaF == 10)
			System.out.println("Aprovado com Distinção."); 
		
		input.close();
	}

}
