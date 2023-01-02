package OO;

import java.util.Scanner;

public class jogo {
	public static void main(String[] args) {
		jogador j = new jogador();
		AlunoParticular a = new AlunoParticular();
		try (Scanner data = new Scanner(System.in)) {
			System.out.println("Digite a suas notas");
			j.nota_1 = data.nextDouble();
			j.nota_2 = data.nextDouble();
			j.nota_3 = data.nextDouble();
			j.nota_4 = data.nextDouble();
			System.out.println(a.teste());
		}
		System.out.println(j.Situacao());
		
	}
}
