import java.util.Scanner;
public class exer23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade:");
		int id1 = input.nextInt();
		System.out.println("Digite a outra idade:");
		int id2 = input.nextInt();
		System.out.println("Digite mais uma idade:");
		int id3 = input.nextInt();

		float mediaF = ((id1+id2+id3)/3);
		
		if(mediaF < 25)
			System.out.println("Turma Jovem.");
		else if((mediaF >= 25) && (mediaF <= 40))
			System.out.println("Turma Adulta.");
		else
			System.out.println("Turma Idosa.");
		
		input.close();
	}
	
}
