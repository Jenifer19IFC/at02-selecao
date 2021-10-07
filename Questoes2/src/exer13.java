import java.util.Scanner;
public class exer13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double ir = 0;
		
		System.out.println("Quanto você ganha por hora? ");
		double moneyh = input.nextDouble();
		System.out.println("E quantas horas você trabalha em um mês? ");
		double horasm = input.nextDouble();
		double salariobruto = (moneyh * horasm);
		
		if(salariobruto <= 900) 
			ir = 0;
		else if((salariobruto > 900) && (salariobruto <= 1500)) 
			ir = ((salariobruto/100) * 5);
		else if((salariobruto > 1500) && (salariobruto <= 2500)) 
			ir = ((salariobruto/100) * 10);
		else if(salariobruto > 2500) 
			ir = ((salariobruto/100) * 20);
		
		double sind = ((salariobruto/100) * 3);
		double inss = ((salariobruto/100) * 10);
		double fgts= ((salariobruto/100) * 11);
		double descontos = (ir+inss+sind);
		double salarioliquido = (salariobruto-descontos);
		
		System.out.println("Salário bruto: ( "+moneyh+" * "+ horasm+" ): R$ "+salariobruto);
		System.out.println("- Sindicato : R$ " + sind);
		System.out.println("-IR : R$ " + ir);
		System.out.println("-INSS (10%) : R$ " + inss);
		System.out.println("FGTS (11%): R$ " +fgts);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.println("Salário líquido: R$ " + salarioliquido);
		
		input.close();
			
	}

}
