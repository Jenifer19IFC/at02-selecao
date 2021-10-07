import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("F ou M? ");    
		String genero = input.nextLine();
		
		if ("F".equalsIgnoreCase(genero))
			System.out.println("Feminino");  
		else if ("M".equalsIgnoreCase(genero))
			System.out.println("Masculino"); 
		else
			System.out.println("Letra inválida");
					
		input.close();
	}

}
