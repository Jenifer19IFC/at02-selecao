import java.util.Scanner;
public class exer6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uum n�mero");
		int num = input.nextInt();
		
		if(num % 2 == 0 )
			System.out.println("O n�mero � par. Ent�o, transformando em �mpar, fica: " + (num-1));
		else
			System.out.println("O n�mero � �mpar. Ent�o, transformando em par, fica: " + (num-1));
		
		input.close();
	}

}
