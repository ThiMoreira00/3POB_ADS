package albergue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Cama> camas = new ArrayList<>();
		ArrayList<Quarto> quartos = new ArrayList<>();
		ArrayList<Reserva> reservas = new ArrayList<>();
		Menu menu = new Menu();
		Scanner sc = new Scanner(System.in);
		int opcao;

		
		Cliente cliente1 = new Cliente(1, "João", "Rua 1", 12345, "Brasil", 123456789, "123456789", "joao@gmail.com", "01/01/2000");
		Cliente cliente2 = new Cliente(2, "Maria", "Rua 2", 12345, "Brasil", 987654321, "987654321", "maria@gnail.com", "02/01/2002");
		clientes.add(cliente1);
		clientes.add(cliente2);

		
		Quarto quarto1 = new Quarto(1, "Master", 3, true, "Quarto bastante arejado.");
		Quarto quarto2 = new Quarto(2, "Standard", 2, false, "Quarto com vista para o mar.");
		quartos.add(quarto1);
		quartos.add(quarto2);

		
		Cama cama1 = new Cama(1, 001, true, "Ao lado da janela", "Tem uma vista para a janela, além de possuir maior conforto para você e sua família.");
		Cama cama2 = new Cama(2, 002, false, "Ao lado da porta", "Tem um espaço entre o corredor para andar.");
		camas.add(cama1);
		camas.add(cama2);





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
					int id;
					System.out.println("ID: ");
					id = sc.nextInt();
					
					
					
					
					for(Cliente cliente : clientes) {
						if(cliente.getId() == id) {
							System.out.println("Já existe um cliente com esse ID!");
							break;
						}
					}


					System.out.println("Nome: ");
					String nome = sc.next();

					System.out.println("Endereço: ");
					String endereco = sc.next();

					System.out.println("Postal Code: ");
					int postalCode = sc.nextInt();

					System.out.println("País: ");
					String pais = sc.next();

					System.out.println("CPF: ");
					int cpf = sc.nextInt();

					
					
					
					for(Cliente cliente : clientes) {
						if(cliente.getCpf() == cpf) {
							System.out.println("Já existe um cliente com esse CPF!");
							break;
						}
					}

					System.out.println("Passaporte: ");
					String passaporte = sc.next();

					System.out.println("E-mail: ");
					String email = sc.next();

					System.out.println("Data de nascimento: ");
					String dataNasc = sc.next();
					
					
					Cliente cliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNasc);
					clientes.add(cliente);
					
					System.out.println("Cliente adicionado com sucesso!");
					break;
				case 2:
					
					
					
					
					
					System.out.println("Digite o ID do cliente que deseja alterar: ");
					int idCliente = sc.nextInt();
					
					
					
					
					for(Cliente clienteAlterar : clientes) {
						if(clienteAlterar.getId() == idCliente) {
							System.out.println("Digite o novo nome: ");
							String nomeAlterar = sc.next();
							clienteAlterar.setNome(nomeAlterar);
							
							System.out.println("Digite o novo endereço: ");
							String enderecoAlterar = sc.next();
							clienteAlterar.setEndereco(enderecoAlterar);
							
							System.out.println("Digite o novo postal code: ");
							int postalCodeAlterar = sc.nextInt();
							clienteAlterar.setPostalCode(postalCodeAlterar);
							
							System.out.println("Digite o novo país: ");
							String paisAlterar = sc.next();
							clienteAlterar.setPais(paisAlterar);
							
							System.out.println("Digite o novo CPF: ");
							int cpfAlterar = sc.nextInt();
							clienteAlterar.setCpf(cpfAlterar);
							
							System.out.println("Digite o novo passaporte: ");
							String passaporteAlterar = sc.next();
							clienteAlterar.setPassaporte(passaporteAlterar);
							
							System.out.println("Digite o novo e-mail: ");
							String emailAlterar = sc.next();
							clienteAlterar.setEmail(emailAlterar);
							
							System.out.println("Digite a nova data de nascimento: ");
							String dataNascAlterar = sc.next();
							clienteAlterar.setDataNascimento(dataNascAlterar);
							
							System.out.println("Cliente alterado com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível alterar o cliente. Não existe cliente com este ID!");					
					break;

				case 3:
					
					
					
					
					System.out.println("Digite o ID do cliente que deseja excluir: ");
					int idClienteExcluir = sc.nextInt();
					
					
					
					
					for(Cliente clienteExcluir : clientes) {
						if(clienteExcluir.getId() == idClienteExcluir) {
							clientes.remove(clienteExcluir);
							System.out.println("Cliente excluído com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível excluir o cliente. Não existe cliente com este ID!");					
					break;

				case 4:
					
					
					
					for(Cliente clienteExibir : clientes) {
						System.out.println(clienteExibir);
					}
					break;

				case 5:
					
					
					
					
					
					System.out.println("Digite o ID do quarto: ");
					int idQuarto = sc.nextInt();
					
					
					
					
					for(Quarto quarto : quartos) {
						if(quarto.getId() == idQuarto) {
							System.out.println("Já existe um quarto com esse ID!");
							break;
						}
					}

					System.out.println("Digite o nome do quarto: ");
					String nomeQuarto = sc.next();

					System.out.println("Digite a quantidade de camas: ");
					int qtdCamas = sc.nextInt();

					System.out.println("Digite se o quarto possui banheiro: ");
					boolean banheiro = sc.nextBoolean();

					System.out.println("Digite a descrição do quarto: ");
					String descricaoQuarto = sc.next();
					
					
					Quarto quarto = new Quarto(idQuarto, nomeQuarto, qtdCamas, banheiro, descricaoQuarto);
					quartos.add(quarto);
					
					System.out.println("Quarto adicionado com sucesso!");
					break;

				case 6:
					
					
					
					
					
					System.out.println("Digite o ID do quarto que deseja alterar: ");
					int idQuartoAlterar = sc.nextInt();
					
					
					
					
					for(Quarto quartoAlterar : quartos) {
						if(quartoAlterar.getId() == idQuartoAlterar) {
							System.out.println("Digite o novo nome do quarto: ");
							String nomeQuartoAlterar = sc.next();
							quartoAlterar.setNomeQuarto(nomeQuartoAlterar);
							
							System.out.println("Digite a nova quantidade de camas: ");
							int qtdCamasAlterar = sc.nextInt();
							quartoAlterar.setQuantidadeCamas(qtdCamasAlterar);
							
							System.out.println("Digite se o quarto possui banheiro: ");
							boolean banheiroAlterar = sc.nextBoolean();
							quartoAlterar.setTemBanheiro(banheiroAlterar);
							
							System.out.println("Digite a nova descrição do quarto: ");
							String descricaoQuartoAlterar = sc.next();
							quartoAlterar.setDescricao(descricaoQuartoAlterar);
							
							System.out.println("Quarto alterado com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível alterar o quarto. Não existe quarto com este ID!");					
					break;

				case 7:
					
					
					
					
					System.out.println("Digite o ID do quarto que deseja excluir: ");
					int idQuartoExcluir = sc.nextInt();
					
					
					
					
					for(Quarto quartoExcluir : quartos) {
						if(quartoExcluir.getId() == idQuartoExcluir) {
							quartos.remove(quartoExcluir);
							System.out.println("Quarto excluído com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível excluir o quarto. Não existe quarto com este ID!");					
					break;

				case 8:
					
					
					
					for(Quarto quartoExibir : quartos) {
						System.out.println(quartoExibir);
					}
					break;

				case 9:
					
					
					
					
					
					System.out.println("Digite o ID da cama: ");
					int idCama = sc.nextInt();
					
					
					
					
					for(Cama cama : camas) {
						if(cama.getId() == idCama) {
							System.out.println("Já existe uma cama com esse ID!");
							break;
						}
					}

					System.out.println("Digite o código da cama: ");
					int codigoCama = sc.nextInt();

					System.out.println("Digite se a cama é beliche: ");
					boolean camaBeliche = sc.nextBoolean();

					System.out.println("Digite a posição da cama: ");
					String posicaoCama = sc.next();

					System.out.println("Digite a descrição da cama: ");
					String descricaoCama = sc.next();
					
					
					Cama cama = new Cama(idCama, codigoCama, camaBeliche, posicaoCama, descricaoCama);
					camas.add(cama);
					
					System.out.println("Cama adicionada com sucesso!");
					break;

				case 10:
					
					
					
					
					
					System.out.println("Digite o ID da cama que deseja alterar: ");
					int idCamaAlterar = sc.nextInt();
					
					
					
					
					for(Cama camaAlterar : camas) {
						if(camaAlterar.getId() == idCamaAlterar) {
							System.out.println("Digite o novo código da cama: ");
							int codigoCamaAlterar = sc.nextInt();
							camaAlterar.setCodigoCama(codigoCamaAlterar);
							
							System.out.println("Digite se a cama é beliche: ");
							boolean camaBelicheAlterar = sc.nextBoolean();
							camaAlterar.setBeliche(camaBelicheAlterar);
							
							System.out.println("Digite a nova posição da cama: ");
							String posicaoCamaAlterar = sc.next();
							camaAlterar.setPosicao(posicaoCamaAlterar);
							
							System.out.println("Digite a nova descrição da cama: ");
							String descricaoCamaAlterar = sc.next();
							camaAlterar.setDescricao(descricaoCamaAlterar);
							
							System.out.println("Cama alterada com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível alterar a cama. Não existe cama com este ID!");					
					break;

				case 11:
					
					
					
					
					System.out.println("Digite o ID da cama que deseja excluir: ");
					int idCamaExcluir = sc.nextInt();
					
					
					
					
					for(Cama camaExcluir : camas) {
						if(camaExcluir.getId() == idCamaExcluir) {
							camas.remove(camaExcluir);
							System.out.println("Cama excluída com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível excluir a cama. Não existe cama com este ID!");					
					break;

				case 12:
					
					
					
					for(Cama camaExibir : camas) {
						System.out.println(camaExibir);
					}
					break;

				case 13:
					
					
					
					
					
					System.out.println("Digite o ID da reserva: ");
					int idReserva = sc.nextInt();
					
					
					
					
					for(Reserva reserva : reservas) {
						if(reserva.getId() == idReserva) {
							System.out.println("Já existe uma reserva com esse ID!");
							break;
						}
					}

					System.out.println("Digite o ID do cliente: ");
					int idClienteReserva = sc.nextInt();

					
					
					
					int verificarCliente = 0;

					for(Cliente clienteVerificar : clientes) {
						if(clienteVerificar.getId() == idClienteReserva) {
							verificarCliente++;
						}
					}

					if(verificarCliente == 0) {
						System.out.println("Não existe cliente com este ID!");
						break;
					}

					System.out.println("Digite o ID do quarto: ");
					int idQuartoReserva = sc.nextInt();

					
					
					
					int verificarQuarto = 0;

					for(Quarto quartoVerificar : quartos) {
						if(quartoVerificar.getId() == idQuartoReserva) {
							verificarQuarto++;
						}
					}

					if(verificarQuarto == 0) {
						System.out.println("Não existe quarto com este ID!");
						break;
					}

					System.out.println("Digite o ID da cama: ");
					int idCamaReserva = sc.nextInt();

					
					
					
					int verificarCama = 0;

					for(Cama camaVerificar : camas) {
						if(camaVerificar.getId() == idCamaReserva) {
							verificarCama++;
						}
					}

					if(verificarCama == 0) {
						System.out.println("Não existe cama com este ID!");
						break;
					}

					System.out.println("Digite a data de entrada: ");
					String dataEntrada = sc.next();

					
					
					
					if(!dataEntrada.matches("\\d{2}/\\d{2}/\\d{4}")) {
						System.out.println("Data de entrada inválida!");
						break;
					}

					System.out.println("Digite a data de saída: ");
					String dataSaida = sc.next();

					if(!dataSaida.matches("\\d{2}/\\d{2}/\\d{4}")) {
						System.out.println("Data de saída inválida!");
						break;
					}
					
					
					Reserva reserva = new Reserva(idReserva, idClienteReserva, idQuartoReserva, idCamaReserva, dataEntrada, dataSaida);
					reservas.add(reserva);
					
					System.out.println("Reserva adicionada com sucesso!");
					break;

				case 14:
					
					
					
					
					
					System.out.println("Digite o ID da reserva que deseja alterar: ");
					int idReservaAlterar = sc.nextInt();
					
					
					
					
					for(Reserva reservaAlterar : reservas) {
						if(reservaAlterar.getId() == idReservaAlterar) {
							System.out.println("Digite o novo ID do cliente: ");
							int idClienteReservaAlterar = sc.nextInt();
							reservaAlterar.setIdCliente(idClienteReservaAlterar);
							
							System.out.println("Digite o novo ID do quarto: ");
							int idQuartoReservaAlterar = sc.nextInt();
							reservaAlterar.setIdQuarto(idQuartoReservaAlterar);
							
							System.out.println("Digite o novo ID da cama: ");
							int idCamaReservaAlterar = sc.nextInt();
							reservaAlterar.setIdCama(idCamaReservaAlterar);
							
							System.out.println("Digite a nova data de entrada: ");
							String dataEntradaAlterar = sc.next();
							reservaAlterar.setDataEntrada(dataEntradaAlterar);
							
							System.out.println("Digite a nova data de saída: ");
							String dataSaidaAlterar = sc.next();
							reservaAlterar.setDataSaida(dataSaidaAlterar);
							
							System.out.println("Reserva alterada com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível alterar a reserva. Não existe reserva com este ID!");					
					break;

				case 15:
					
					
					
					
					System.out.println("Digite o ID da reserva que deseja excluir: ");
					int idReservaExcluir = sc.nextInt();
					
					
					
					
					for(Reserva reservaExcluir : reservas) {
						if(reservaExcluir.getId() == idReservaExcluir) {
							reservas.remove(reservaExcluir);
							System.out.println("Reserva excluída com sucesso!");
							break;
						}
					}

					System.out.println("Não foi possível excluir a reserva. Não existe reserva com este ID!");					
					break;

				case 16:
					
					
					
					for(Reserva reservaExibir : reservas) {
						System.out.println(reservaExibir);
					}
					break;

				case 17:
					
					System.out.println("Obrigado por utilizar o sistema!");
					break;

				default:
					System.out.println("Opção inválida!");
					break;


					



				
				
			}
			
			
		} while (opcao != 17);
		
		
		
	}

}
