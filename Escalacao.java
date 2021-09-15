package entities;

/*
 * Alunos: Larissa Perazzo e Luiz Felipe Oliveira
 */

public class Escalacao {
	
	public void imprimir(Time t, Jogador jog) {
		System.out.println("Time: "+ t.getNome());
		System.out.println("-------------------------");
		for(int i=0;i<jog.getJogadores().length;i++) {
			System.out.println(jog.toString(i));
		}
	}
}
