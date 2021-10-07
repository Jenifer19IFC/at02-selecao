import java.util.Scanner;
public class exer17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String conceito;
		String situ = null;
		System.out.println("Digite a primeira nota: ");  
		float nota1F = input.nextFloat(); 
		System.out.println("Digite a segunda nota: ");
		float nota2F = input.nextFloat();
		
		float mediaF = (float) ((nota1F + nota2F) / 2);
		
		if((mediaF >= 9) && (mediaF <= 10)) {
			conceito = "A";
			situ = "APROVADO";
		}else if((mediaF >= 7.5) && (mediaF < 9)) {
			conceito = "B";
		situ = "APROVADO";
		}else if((mediaF >= 6) && (mediaF < 7.5)) {
			conceito = "C";
			situ = "APROVADO";
		}else if((mediaF >= 4) && (mediaF < 6)) {
			conceito = "D";
			situ = "REPROVADO";
		}else if((mediaF >= 0) && (mediaF < 4)) {
			conceito = "E";
			situ = "REPROVADO";
		}
		
		System.out.println("Notas: " + nota1F + " e " + nota2F);
		System.out.println("Média: " + mediaF); 
		System.out.println(situ); 
		
		input.close();
	}

}
