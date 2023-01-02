package PooEncapsulamento;

public class PessoaTeste {
		public static void main(String[] args) {
			Pessoa p1 = new Pessoa();
			p1.SetIdade(51);
			System.out.println(p1.GetIdade());
			p1.MaiorIdade(15);
			System.out.println(p1.situacaoIdade);
		}
}
