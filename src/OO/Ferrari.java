package OO;

public class Ferrari extends Carro  {
	int Velocidade;
	int limite =10;
	
	Ferrari(){
		super(200);
	}
	int Acelerar() {
		
		return this.Velocidade = Velocidade + 15;
	}
	
	int Frear() {
		if(Velocidade <=0) {
			return this.Velocidade = 0;
		}
		else {
			return this.Velocidade = Velocidade - 10;	
		}
		
	}
	void VelocidadeAtual() {
		System.out.println(Velocidade);
	}
}
