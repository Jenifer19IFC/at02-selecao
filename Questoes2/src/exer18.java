import java.util.Scanner;
public class exer18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a medida de um lado do tri�ngulo: "); 
		float aF = input.nextFloat();
		System.out.println("Digite outra medida do lado do tri�ngulo: ");
		float bF = input.nextFloat();
		System.out.println("Digite a medida de mais um lado do tri�ngulo: "); 
		float cF = input.nextFloat();
		
		if((aF + bF ) > cF)
			System.out.println("Pode ser um tri�ngulo.");
		else if((aF + cF ) > bF)
			System.out.println("Ele pode ser um tri�ngulo.");
		else if((bF + cF ) > aF)
			System.out.println("Pode ser um tri�ngulo.");
		else 
			System.out.println("N�o pode ser um tri�ngulo.");
		
		if((aF == bF) && (bF == cF))
			System.out.println("� um tri�ngulo equil�tero.");
		else if((aF == bF) || (aF == cF) || (cF == bF))
			System.out.println("� um tri�ngulo is�celes.");
		else 
			System.out.println("� um tri�ngulo escaleno.");
		
		input.close();
	}

}
