import java.util.Scanner;
public class exer11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Em qual período você estuda? M - Matutino; V - Vespertino; N - Noturno)");
		String p = input.nextLine();
		
		if("M".equalsIgnoreCase(p))
			System.out.println("Bom dia!");
		else if ("V".equalsIgnoreCase(p))
			System.out.println("Boa tarde!");
		else if ("N".equalsIgnoreCase(p))
			System.out.println("Boa noite!");
		else 
			System.out.println("Erro - Inválido");
		
		input.close();
		}
	}

