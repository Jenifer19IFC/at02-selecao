import java.util.Scanner;
public class exer2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número: ");    
		int num = input.nextInt();
		
		if(num > 0) 
			System.out.println("Positivo");
		else if(num < 0)
			System.out.println("Negativo");
		else
			System.out.println("Zero");	
	
		input.close();
	}

}
		
