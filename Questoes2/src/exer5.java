import java.util.Scanner;
public class exer5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");  
		String letra = input.nextLine();
		
		if (("A".equalsIgnoreCase(letra)) || ("E".equalsIgnoreCase(letra)) || ("I".equalsIgnoreCase(letra)) || ("O".equalsIgnoreCase(letra)) || ("U".equalsIgnoreCase(letra)))
			System.out.println("� uma vogal.");
		else 
			System.out.println("N�o � uma vogal.");
		
		input.close();
	}

}
