import java.util.Scanner;
public class exer29 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int sim = 0;
		int nao = 0;
		
		System.out.println("Question�rio criminal! Responda com true ou false.");
		System.out.println("Telefonou para v�tima?");
		boolean r1 = input.nextBoolean();
			if(r1 == true)
				sim = sim+1;
		
		System.out.println("Esteve no local do crime?");
		boolean r2 = input.nextBoolean();
			if(r2 == true)
				sim = sim+1;
		
		System.out.println("Mora perto da v�tima?");
		boolean r3 = input.nextBoolean();
			if(r3 == true)
				sim = sim+1;
		
		System.out.println("Devia para v�tima?");
		boolean r4 = input.nextBoolean();
			if(r4 == true)
				sim = sim+1;
	
		System.out.println("J� trabalhou com a v�tima?");
		boolean r5 = input.nextBoolean();
			if(r5 == true)
				sim = sim+1;
		
		if(sim == 2)
			System.out.println("Suspeita.");
		else if((sim == 3) || (sim == 4))
			System.out.println("C�mplice.");
		else if(sim == 5)
			System.out.println("Assassino.");
		else 
			System.out.println("Inocente.");
		
		input.close();
	}

}
