import java.util.Scanner;
public class exer21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma data no formato dd/mm/aaaa: ");
		System.out.println("Dia:");
		int d = input.nextInt();
		System.out.println("Mês:");
		int m = input.nextInt();
		System.out.println("Ano:");
		int a = input.nextInt();
		
		if((d >= 1) && (d <= 31))
			if((m >= 1) && (m <= 12)) 
				if(a  > 0) 
					System.out.println("Data válida.");
		
		if((((d == 0) || (d > 31))) || ((m == 0) || (m > 12)) || (a  < 0))
			System.out.println("Data inválida.");
			
		input.close();		
	}
}
