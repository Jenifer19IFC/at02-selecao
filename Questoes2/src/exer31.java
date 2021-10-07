import java.util.Scanner;
public class exer31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double vmorango1 = 2.50;
		double vmorango2 = 2.20;
		double vmaca1 = 1.80;
		double vmaca2 = 1.50;
		double totalmor,totalmaca,valordesc, desc = 0;
		float frutasF;
		double total;
		
		System.out.println("Digite a quantidade (em kg) de morangos adquiridos:");
		float morangoF = input.nextFloat();
		System.out.println("Digite a quantidade (em kg) de maçãs adquiridas:");
		float macaF = input.nextFloat();
		
		double kg = morangoF+macaF;
		if(morangoF <= 5) {
			totalmor = morangoF * vmorango1;
			total = totalmor;
		} else {
			totalmor = morangoF * vmorango2;
			total = totalmor;
			
		}if(macaF <= 5) {
			totalmaca = macaF * vmaca1;
			total = total + totalmaca;
		}else {
			totalmaca = macaF * vmaca2;
			total = total + totalmaca;
			
		}if((kg > 8) || (total > 25)) {
			desc = ((total/100)*10);
			valordesc = total-desc;
			System.out.println("Valor a ser pago com desconto de 10% R$ " + valordesc);
			System.exit(0);	
		}
		System.out.println("Valor a ser pago: R$ " + total);
		input.close();
			
	}

}