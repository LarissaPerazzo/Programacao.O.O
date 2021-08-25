package intro;

import java.util.Scanner;

public class LerVetor {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[] num = new int[5];
		
		//Ler números pelo teclado		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Entre com o número " + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
		
		//Exibir vetor
		for(int n : num) {
			System.out.println(n);
		}

		sc.close();
		
	}

}
