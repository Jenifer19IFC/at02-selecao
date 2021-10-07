import java.util.Scanner;
public class exer15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o preço do produto:");
		double preco = input.nextDouble();
		System.out.println("Insira o código de origem:");
		int codigo = input.nextInt();
		
		if(codigo == 1)
			System.out.println("Preço do produto: R$ " + preco + " e procedência Sul.");
		else if(codigo == 2)	
			System.out.println("Preço do produto: R$ " + preco + " e procedência Norte.");
		else if(codigo == 3)	
			System.out.println("Preço do produto: R$ " + preco + " e procedência Leste.");
		else if(codigo == 4)	
			System.out.println("Preço do produto: R$ " + preco + " e procedência Oeste.");
		else if((codigo == 5) || (codigo == 6))
			System.out.println("Preço do produto: R$ " + preco + " e procedência Nordeste.");
		else if((codigo == 7) || (codigo == 8))
			System.out.println("Preço do produto: R$ " + preco + " e procedência Centro-Oeste.");	
		else 
			System.out.println("Produto importado");
		
		input.close();
	}

}
