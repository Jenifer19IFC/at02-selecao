import java.util.Scanner;
public class exer25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n100,n50, n10, n5, n1;
		int r100, r50, r10, r5, r1;
		
		System.out.println("Digite o valor do saque (Saque mínimo = 10 e máximo = 600!)");
		int saque = input.nextInt();
		
		if((saque >= 10) && (saque <= 600)) {
			n100 = saque/100;
			r100 = saque % 100;
		
			n50 = r100/50;
			r50 = r100 % 50;
		
			n10 = r50/10;
			r10 = r50 % 10;
		
			n5 = r10 / 5;
			r5 = r10 % 5;
		
			n1 = r5 / 1;
			r1 = r5 % 1;
		
		System.out.println("Para sacar o programa fornece: ");
		System.out.println(n100 + " nota(s) de 100");
		System.out.println(n50 + " nota(s) de 50");
		System.out.println(n10 + " nota(s) de 10");
		System.out.println(n5 + " nota(s) de 5");
		System.out.println(n1 + " nota(s) de 1");
		
		} else {
			System.out.println("Valor de saque inválido:");
		}
		
		input.close();
	}

}
