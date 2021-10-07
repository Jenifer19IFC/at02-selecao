import java.util.Scanner;
public class exer22 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro menor que 1000:");
		int num = input.nextInt();
		
		int uni = num %10;
		int dez = (((num-uni)/10)%10);
		int cen = num / 100;		
		System.out.println(uni + " unidade(s)");
		System.out.println(dez + " dezena(s)");
		System.out.println(cen + " centena(s)");
		
		input.close();
	}

}
