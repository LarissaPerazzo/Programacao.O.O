package intro;

import java.util.Scanner;

public class ComparaString {

	public static void main(String[] args) {
		String senha = "semana2";
		String resposta = "";
		Scanner sc = new Scanner(System.in);
		
		//Pedir senha
		System.out.println("Entre com a senha: ");
		resposta = sc.next();
		
		//Compara string
		if(resposta.equalsIgnoreCase(senha)) {
			System.out.println("Permiss�o concedida!!");
		}
		else {
			System.out.println("Permiss�o negada!!");
		}
		sc.close();
	}

}
