import java.util.Scanner;
public class exer6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uum número");
		int num = input.nextInt();
		
		if(num % 2 == 0 )
			System.out.println("O número é par. Então, transformando em ímpar, fica: " + (num-1));
		else
			System.out.println("O número é ímpar. Então, transformando em par, fica: " + (num-1));
		
		input.close();
	}

}
