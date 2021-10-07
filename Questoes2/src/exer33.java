import java.util.Scanner;
public class exer33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pont = 0;
		System.out.println("Informe os resultados assinalados pelo candidato:");
		String r1 = input.nextLine();
		String r2 = input.nextLine();
		String r3 = input.nextLine();
		String r4 = input.nextLine();
		String r5 = input.nextLine();
		String r6 = input.nextLine();
		String r7 = input.nextLine();
		String r8 = input.nextLine();
		String r9 = input.nextLine();
		String r10 = input.nextLine();
		
		if("a".equals(r1)) {
			System.out.println("Q1: " + r1 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q1: " + r1 + " : Errada, resposta correta(a)");
		}
		if("a".equals(r2)) {
			System.out.println("Q2: " + r1 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q2: " + r2 + " : Errada, resposta correta(a)");
		}
		if("b".equals(r3)) {
			System.out.println("Q3: " + r3 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q3: " + r3 + " : Errada, resposta correta(b)");
		}
		if("b".equals(r4)) {
			System.out.println("Q4: " + r4 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q4: " + r4 + " : Errada, resposta correta(b)");
		}
		if("c".equals(r5)) {
			System.out.println("Q5: " + r5 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q5: " + r5 + " : Errada, resposta correta(c)");
		}
		if("c".equals(r6)) {
			System.out.println("Q6: " + r6 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q6: " + r6 + " : Errada, resposta correta(c)");
		}
		if("d".equals(r7)) {
			System.out.println("Q7: " + r7 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q7: " + r7 + " : Errada, resposta correta(d)");
		}
		if("d".equals(r8)) {
			System.out.println("Q8: " + r8 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q8: " + r8 + " : Errada, resposta correta(d)");
		}
		if("e".equals(r9)) {
			System.out.println("Q9: " + r9 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q9: " + r9 + " : Errada, resposta correta(e)");
		}
		if("e".equals(r10)) {
			System.out.println("Q10: " + r10 + " : Correto");
			pont = pont+1;
		}else {
			System.out.println("Q10: " + r10 + " : Errada, resposta correta(e)");
		}
		System.out.println("Pontuação final: " + pont);
		
		input.close();
	}

}
