package OO;

public class jogador {
	double nota_1;
	double nota_2;
	double nota_3;
	double nota_4;
	double nota_final;
	
	double CalcularMedia(double nota_1,double nota_2,double nota_3, double nota_4) {
	 nota_final = (nota_1 + nota_2 + nota_3 + nota_4) /4;
		return nota_final;
	}
	
	String Situacao() {
		CalcularMedia(nota_1,nota_2,nota_3,nota_4);
		if(nota_final >5) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
	}

}
