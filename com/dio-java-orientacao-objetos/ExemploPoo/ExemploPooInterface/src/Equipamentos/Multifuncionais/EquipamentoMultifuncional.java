package Equipamentos.Multifuncionais;

import Equipamentos.Copiadoras.Copiadora;
import Equipamentos.Digitalizadoras.Digitalizadora;
import Equipamentos.Impressoras.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{
	@Override
	public void Copiar() {
		System.out.println("Copiando via Multifuncional");
		
	}
	@Override
	public void Digitalizar() {
		System.out.println("Digitalizando via Multifuncional");
		
		
	}
	@Override
	public void imprimir() {
		System.out.println("Imprimindo via Multifuncional");
		
		
	}
}
