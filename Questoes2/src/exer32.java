import java.util.Scanner;
public class exer32 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double duplo1 = 4.90, duplo2 = 5.80;
		double alcatra1 = 5.90, alcatra2 = 6.80;
		double picanha1 = 6.90, picanha2 = 7.80;
		double valor=0,desc = 0, valordesc;
		
		
		System.out.println("Qual tipo de carne? -Filé Duplo; Alcatra; Picanha-");
		String tipo = input.nextLine();
		System.out.println("Quantidade de carne comprada:" );
		float kgF = input.nextFloat();
		System.out.println("Tipo de pagamento: Cartão Tabajara?(true). Se não, false.");
		boolean cartao = input.nextBoolean();
		
		if(("FD".equalsIgnoreCase(tipo)) && (kgF <= 5))  
	        valor = kgF * duplo1;
		 else if(("FD".equalsIgnoreCase(tipo)) && (kgF > 5))  
		      valor = kgF * duplo2;
		
		if(("A".equalsIgnoreCase(tipo)) && (kgF <= 5))
             valor = kgF * alcatra1;
		else if(("A".equalsIgnoreCase(tipo)) && (kgF > 5)) 
     	        valor = kgF * alcatra2;
		          
		if(("P".equalsIgnoreCase(tipo)) && (kgF <= 5))
			valor = kgF * picanha1;
		else if(("P".equalsIgnoreCase(tipo)) && (kgF > 5)) 
			valor = kgF * picanha2;	
		
		if(cartao == true) 
			desc = ((valor/100)*5);
			valordesc = (valor-desc);
		
		System.out.println("Tipo de carne: " + tipo);
		System.out.println("Quantidade de carne: " + kgF);
		System.out.println("Preço total: R$ " + valor);
		System.out.println("Cartão Tabajara? " + cartao);
		System.out.println("Valor do desconto: R$ " + desc);
		System.out.println("Valor a pagar: R$" + valordesc);
		
		input.close();
	}

}
