package albergue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cliente> clientes;
		ArrayList<Cama> camas;
		ArrayList<Quarto> quartos;
		ArrayList<Reserva> reservas;
		Menu menu = new Menu();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("Olá, seja bem-vindo ao albergue!");
		
		do {
			menu.exibir();
			
			System.out.println("O que você deseja fazer?");
			opcao = sc.nextInt();
			
			
			/*
			 * 
			 * System.out.println("[1] Incluir cliente");
		System.out.println("[2] Alterar cliente");
		System.out.println("[3] Excluir cliente");
		System.out.println("[4] Listar clientes");
		System.out.println();
		System.out.println("[5] Incluir quarto");
		System.out.println("[6] Alterar quarto");
		System.out.println("[7] Excluir quarto");
		System.out.println("[8] Listar quartos");
		System.out.println();
		System.out.println("[9] Incluir cama");
		System.out.println("[10] Alterar cama");
		System.out.println("[11] Excluir cama");
		System.out.println("[12] Listar camas");
		System.out.println();
		System.out.println("[13] Incluir reserva");
		System.out.println("[14] Alterar reserva");
		System.out.println("[15] Excluir reserva");
		System.out.println("[16] Listar reservas");
		System.out.println();
		System.out.println("[17] Sair");
			 */
			switch(opcao) {
				case 1: 
					/*
					 * A classe Cliente possui os seguintes atributos: id, nome, endereço, postalCode, pais, cpf,
Passaporte, email, dataNascimento.
					 * 
					 */
					int valor;
					System.out.println("ID: ");
					valor = sc.nextInt();
					
					// Verificando se já existe
				
				
			}
			
			
		} while (opcao != 17);
		
		
		
	}

}
