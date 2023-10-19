package br.edu.faeterj;

import java.util.Scanner;

public class Menu {

	public static boolean acoes() {
		
		String valor;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Você deseja continuar comprando? [S/N]");
			valor = sc.next();
			sc.close();

			// Se quiser continuar comprando...
			if (valor.equalsIgnoreCase("S")) {
	            return true;

        	} else if (valor.equalsIgnoreCase("N")) {
	            return false;
        	}

		} while(valor != "S" && valor != "N");

		return false;

	}

}
