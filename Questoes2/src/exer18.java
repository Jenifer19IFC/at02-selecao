import java.util.Scanner;
public class exer18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a medida de um lado do triângulo: "); 
		float aF = input.nextFloat();
		System.out.println("Digite outra medida do lado do triângulo: ");
		float bF = input.nextFloat();
		System.out.println("Digite a medida de mais um lado do triângulo: "); 
		float cF = input.nextFloat();
		
		if((aF + bF ) > cF)
			System.out.println("Pode ser um triângulo.");
		else if((aF + cF ) > bF)
			System.out.println("Ele pode ser um triângulo.");
		else if((bF + cF ) > aF)
			System.out.println("Pode ser um triângulo.");
		else 
			System.out.println("Não pode ser um triângulo.");
		
		if((aF == bF) && (bF == cF))
			System.out.println("É um triângulo equilátero.");
		else if((aF == bF) || (aF == cF) || (cF == bF))
			System.out.println("É um triângulo isóceles.");
		else 
			System.out.println("É um triângulo escaleno.");
		
		input.close();
	}

}
