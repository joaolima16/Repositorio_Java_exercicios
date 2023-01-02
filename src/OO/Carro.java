package OO;

public class Carro {
	public int Velocidade;
	final int VELOCIDADEMAXIMA;
	
	
	Carro(int VELOCIDADEMAXIMA){
		this.VELOCIDADEMAXIMA = VELOCIDADEMAXIMA;
	}
	int Acelerar() {
		if(Velocidade + 5 > VELOCIDADEMAXIMA) {
			Velocidade = VELOCIDADEMAXIMA;
		}
		return this.Velocidade = Velocidade +5;
	}
	int Frear() {
		
		if(Velocidade <=0) {
			return this.Velocidade = 0;
		}
		else {
			return this.Velocidade = Velocidade - 5;	
		}
		
	}
	void VelocidadeAtual() {
		System.out.println(Velocidade);
	}
}
