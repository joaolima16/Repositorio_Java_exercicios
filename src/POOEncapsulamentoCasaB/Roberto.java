package POOEncapsulamentoCasaB;

import POOEncapsulamentoCasaA.Ana;

public class Roberto extends Ana{
	Ana irmao = new Ana();
	void TesteAcesso() {
		
		System.out.println(irmao.todosAcessam);
		System.out.println(super.VisaoHeranca);
	}
}
