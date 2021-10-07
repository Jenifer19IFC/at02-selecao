import java.util.Scanner;
public class exer29 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int sim = 0;
		int nao = 0;
		
		System.out.println("Questionário criminal! Responda com true ou false.");
		System.out.println("Telefonou para vítima?");
		boolean r1 = input.nextBoolean();
			if(r1 == true)
				sim = sim+1;
		
		System.out.println("Esteve no local do crime?");
		boolean r2 = input.nextBoolean();
			if(r2 == true)
				sim = sim+1;
		
		System.out.println("Mora perto da vítima?");
		boolean r3 = input.nextBoolean();
			if(r3 == true)
				sim = sim+1;
		
		System.out.println("Devia para vítima?");
		boolean r4 = input.nextBoolean();
			if(r4 == true)
				sim = sim+1;
	
		System.out.println("Já trabalhou com a vítima?");
		boolean r5 = input.nextBoolean();
			if(r5 == true)
				sim = sim+1;
		
		if(sim == 2)
			System.out.println("Suspeita.");
		else if((sim == 3) || (sim == 4))
			System.out.println("Cúmplice.");
		else if(sim == 5)
			System.out.println("Assassino.");
		else 
			System.out.println("Inocente.");
		
		input.close();
	}

}
