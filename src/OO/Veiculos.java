package OO;

public class Veiculos {
	public static void main(String[] args) {
		
		Carro c = new Carro(150);
		Ferrari f = new Ferrari();
		f.Acelerar();
		c.Acelerar();
		c.Frear();
		c.Frear();
		c.Frear();
		f.Frear();
		f.Frear();
		c.VelocidadeAtual();
		f.VelocidadeAtual();
		System.out.println(f.limite);
	}
}
