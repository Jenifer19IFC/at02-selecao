import java.util.Scanner;
public class exer15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o pre�o do produto:");
		double preco = input.nextDouble();
		System.out.println("Insira o c�digo de origem:");
		int codigo = input.nextInt();
		
		if(codigo == 1)
			System.out.println("Pre�o do produto: R$ " + preco + " e proced�ncia Sul.");
		else if(codigo == 2)	
			System.out.println("Pre�o do produto: R$ " + preco + " e proced�ncia Norte.");
		else if(codigo == 3)	
			System.out.println("Pre�o do produto: R$ " + preco + " e proced�ncia Leste.");
		else if(codigo == 4)	
			System.out.println("Pre�o do produto: R$ " + preco + " e proced�ncia Oeste.");
		else if((codigo == 5) || (codigo == 6))
			System.out.println("Pre�o do produto: R$ " + preco + " e proced�ncia Nordeste.");
		else if((codigo == 7) || (codigo == 8))
			System.out.println("Pre�o do produto: R$ " + preco + " e proced�ncia Centro-Oeste.");	
		else 
			System.out.println("Produto importado");
		
		input.close();
	}

}
