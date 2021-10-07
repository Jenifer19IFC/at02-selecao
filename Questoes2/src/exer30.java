import java.util.Scanner;
public class exer30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double alcool = 1.90;
		double gasolina = 2.50;
		double total;
		
		System.out.println("Tipo de combustível: A- Álcool; G-Gasolina.");
		String tipo = input.nextLine();
		System.out.println("Número de litros vendidos:");
		float litrosF = input.nextFloat();
		
		if (("A".equalsIgnoreCase(tipo)) && (litrosF <= 20)) { 
			double vsemdesc = litrosF * alcool;
			double vcomdesc = (vsemdesc/100) * 3;
			total = vsemdesc-vcomdesc;
			System.out.println("Valor a ser pago: R$ " + total);
		}	else if (("A".equalsIgnoreCase(tipo)) && (litrosF > 20)){
				double vsemdesc = litrosF * alcool;
				double vcomdesc = (vsemdesc/100) * 5;
				total = vsemdesc-vcomdesc;
				System.out.println("Valor a ser pago: R$ " + total);

		}if(("G".equalsIgnoreCase(tipo)) && (litrosF <= 20)){
			double vsemdesc = litrosF * gasolina;
			double vcomdesc = (vsemdesc/100) * 4;
			total = vsemdesc-vcomdesc;
			System.out.println("Valor a ser pago: R$ " + total);

		}	else if(("G".equalsIgnoreCase(tipo)) && (litrosF > 20)) {
				double vsemdesc = litrosF * gasolina;
				double vcomdesc = (vsemdesc/100) * 6;
				total = vsemdesc-vcomdesc;
				System.out.println("Valor a ser pago: R$ " + total);

				
		input.close();
		}			
	}
}

