import java.util.Scanner;
public class exer7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");  
		int a = input.nextInt();
		System.out.println("Digite outro número: ");  
		int b = input.nextInt();
		System.out.println("Digite mais um número: ");  
		int c = input.nextInt();
		
		if((a > b) && (b > c)) {
			System.out.println(a +" " + b +" "+ c);
		}else if((a > c) && (c > b)) {
				System.out.println(a +" " + c +" "+ b); 
		}else if ((b > a) && (a > c)) {
			System.out.println(b +" " + a +" "+ c); 
		}else if((b > c) && (c > a)) {
			System.out.println(b +" " + c +" "+ a); 
		}else if((c > a) && (a > b)) {
			System.out.println(c +" " + a +" "+ b); 
		}else if((c > b) && (b > a)) {
			System.out.println(c +" " + b +" "+ a); 
		}
		input.close();
	}

}