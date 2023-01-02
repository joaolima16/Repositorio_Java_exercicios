package PooEncapsulamento;

public class Pessoa {
	private int idade;
	public String situacaoIdade;
	
	
	public void  SetIdade(int novaIdade) {
		if(novaIdade>=0) {
			this.idade = novaIdade;	
		}
		else {
			System.out.println("Idade invalida!");
		}
	}
	
	public int GetIdade() {
		return idade;
	}
	
	public String  MaiorIdade(int idade) {
		System.out.println(idade);
		if(idade>=18) {
			return this.situacaoIdade = "maior De idade";
		}
		else {
			return this.situacaoIdade = "menor de idade";
	
		}
	}
}
