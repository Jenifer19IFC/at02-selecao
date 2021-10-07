import java.util.Scanner;
public class exer9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double h, pesoideal, kg;
		String sexo, media;
		
		System.out.println("Infome a altura:");
		h = input.nextDouble();
		System.out.println("Informe o peso:");
		kg = input.nextDouble();
		System.out.println("Informe o sexo (F - Feminino e M - Masculino):");
		sexo = input.next();
		
		if(sexo.equals("F")) 
			pesoideal = (62.1*h)-44.7;
		else 
			pesoideal = (72.7*h)-58;

		if(kg > pesoideal) 
			media = "Peso acima do ideal.";
		else if(kg < pesoideal) 
			media = "Peso abaixo do ideal.";
		else 
			media = "No peso ideal";
		
		System.out.println("Peso: " + kg);
		System.out.println("Altura: " + h);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso ideal: " + pesoideal);
		System.out.println(media);

		input.close();
	}
}
	


