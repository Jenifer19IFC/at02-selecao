import java.util.Scanner;
public class exer12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double aumento, novos;
		String percentual;
		
		System.out.println("Informe o salário do colaborador:");
		double salario = input.nextDouble();
		
		if(salario <= 280) {
			aumento = ((salario/100) * 20);
			percentual = "20%";
			novos = salario + aumento;
		}else if((salario > 280) && (salario <=700)) {
			aumento = ((salario/100) * 15);
			percentual = "15%";
			novos = salario + aumento;
		}else if ((salario > 700) && (salario < 1500)) {
			aumento =  ((salario/100) * 10);
			percentual = "10%";
			novos = salario + aumento;
		}else {
			aumento = ((salario/100) * 5);
			percentual = "5%";
			novos = salario + aumento;
		}
		System.out.println("Salário antes do reajuste: R$ = " + salario);
		System.out.println("Percentual de aumento aplicado: " + percentual);
		System.out.println("Valor do aumento: R$ = " + aumento);
		System.out.println("Novo salário após o aumento: R$ = " + novos);
		
		input.close();
	}

}
