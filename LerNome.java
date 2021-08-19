package intro;

import java.util.Scanner;

public class LerNome {

	public static void main(String[] args) {
		
		String nome = "";
		int idade = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Solicita o nome pelo teclado
		System.out.println("Entre com o nome: ");
		
		//Ler nome
		nome = teclado.next();
		
		//Ler idade
		System.out.println("Qual a sua idade? ");
		//idade = Integer.parseInt(teclado.next());
		idade =  teclado.nextInt();
		
		//teste idade
		if(idade < 18) {
			System.out.println("Você não pode entrar!!!");
		}
		else {
			System.out.println("Entrada permitida!!!");
		}
		
		//Imprime saudação
		System.out.println("Olá " + nome + ", boa noite!");
		System.out.printf("Você tem %d anos de idade!\n",idade);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
		teclado.close();
	}

}
