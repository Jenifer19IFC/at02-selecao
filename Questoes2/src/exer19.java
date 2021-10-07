import java.util.Scanner;
public class exer19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float xF, deltaF;
		System.out.println("Programa para calcular as raízes de uma equação");
		
		System.out.println("Digite o valor de a:");
		float aF = input.nextFloat();
		if(aF == 0) {
			System.out.println("Não é uma equação do segundo grau.");
			System.exit(0);		
		}
		System.out.println("Digite o valor de b:");
		float bF = input.nextFloat();
		System.out.println("Digite o valor de c:");
		float cF = input.nextFloat();
		
		deltaF = (bF*bF) + (-4 * (aF*cF)); 
		if (deltaF < 0 ) {
			System.out.println("Delta negativo! Então, a equação não possui raizes reais.");
			System.exit(0);	
		}else if(deltaF == 0) {
			System.out.println("A equação possui apenas uma raiz real.");
		}else if(deltaF > 0) {
			System.out.println("A equação possui duas raizes reais.");
		}
		
		float x1F = (float) ((-(bF) + Math.sqrt(deltaF)) / 2 * aF);
		float x2F = (float) ((-(bF) - Math.sqrt(deltaF)) / 2 * aF);
		
		System.out.println("x1 = " + x1F);
		System.out.println("x2 = " + x2F);
	
		input.close();
	}

}
