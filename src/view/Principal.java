package view;

import Controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		PotenciaController pc = new PotenciaController();
		int base = 3;
		int expoente = 3;
		int pot = pc.pot (base, expoente);
		
		System.out.println("Com laco ==> "+pot);		
		int potencia = pc.potencia(base, expoente);
				
			System.out.println("Com recursividade ==> " +potencia);
	}

}
