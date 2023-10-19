package br.edu.faeterj;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
	private ArrayList<Aluno> alunos = new ArrayList();
	private int opcao = 0;
	
	public void Processamento() {
		String nome = "";
		String cpf;
		Date dtNasc;
		String dtAux;
		String matricula;
		String endereco;
		String cep;
		Scanner sc = new Scanner(System.in);
		char resposta = 'S';
		
	
		
			do {
				System.out.println("Digite a opção:");
				System.out.println("1- Incluir Aluno: ");
				System.out.println("2- Alterar Aluno: ");
				System.out.println("3- Excluir Aluno: ");
				System.out.println("4- Listar Alunos: ");
				System.out.println("5- Buscar Aluno: ");
				System.out.println("6- Sair ");
				
				opcao = sc.nextInt();
				
				System.out.println("opção é: " + opcao);
				
				switch(opcao)
				{
				case 1:
					IncluirAluno();
					break;
				case 2:
					AlterarAluno();
					break;
				case 3:
					ExcluirAluno();
					break;
					
				case 4:
					ListarAluno();
					break;
					
				case 5:
					BuscarAluno();
					break;
					
				case 6:
					System.exit(0);
					break;
					
				default:
					System.out.println("Opção inválida. Tente novamente!");
				}
				
				
			} while (opcao != 6);
				
					
	}
	public Boolean ValidaNome() {
		Pattern pattern = Pattern.compile("^[a-z]+[\\s][a-z]+$", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Visit WSchools");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Nome Match found");
	      return true;
	    } else {
	      System.out.println("Nome Match not found");
	      return false;
	    }
	}
	public Boolean ValidaCpf() {
		Pattern pattern = Pattern.compile("^[0-9]{3}.[0-9]+.[0-9]+-[0-9]+$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("123.456.789-01");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("CPF Match found");
	    } else {
	      System.out.println("CPF Match not found");
	    }
	    return matchFound;
	}
	public Boolean IncluirAluno() {
		String nome = "";
		String cpf;
		Date dtNasc;
		String dtAux;
		String matricula;
		String endereco;
		String cep;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome ");
			nome = sc.next();
			System.out.println("Digite seu CPF (somente os numeros): ");
			cpf = sc.next();
			System.out.println("Digite sua data de nascimento: dd/mm/aaaa: ");
			dtAux = sc.next();
			System.out.println("Digite sua matricula: ");
			matricula = sc.next();
			System.out.println("Digite seu Endereço: ");
			endereco = sc.next();
			System.out.println("Digite seu CEP (somente os numeros): ");
			cep = sc.next();
			
			Aluno aluno = new Aluno(nome, cpf, matricula, dtAux, endereco, cep);
			
			alunos.add(aluno);
			

		return true;
	}
	public void AlterarAluno() {
		String matricula;
		int indice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a matricula do aluno que você quer alterar: ");
		matricula = sc.next();
		//Percorre o vetor de alun para encontrar o objeto de aluno(altALuno), que equivaleria a alunos[i]
		
	    for (Aluno altAluno : alunos) {
	    	if (altAluno.getMatricula() == matricula) {
	    		System.out.println(altAluno.getMatricula());
				indice = alunos.indexOf(altAluno);
	    	}
	    }

		// Perguntando o que deseja alterar
		// 1 - Nome
		// 2 - CPF
		// 3 - Data de Nascimento
		// 4 - Endereço
		// 5 - CEP
		// 6 - Sair
		// 7 - Opção inválida. Tente novamente!


		System.out.println("Digite a opção:");
		System.out.println("1- Nome ");
		System.out.println("2- CPF ");
		System.out.println("3- Data de Nascimento ");
		System.out.println("4- Endereço ");
		System.out.println("5- CEP ");
		System.out.println("6- Sair ");

		opcao = sc.nextInt();

		System.out.println("opção é: " + opcao);

		switch(opcao)
		{
		case 1:
			System.out.println("Digite o novo nome: ");
			String nome = sc.next();
			alunos.get(indice).setNome(nome);
			break;
		case 2:
			System.out.println("Digite o novo CPF: ");
			String cpf = sc.next();
			alunos.get(indice).setCpf(cpf);
			break;
		case 3:
			System.out.println("Digite a nova data de nascimento: ");
			String dataAux = sc.next();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date dtAux = formatter.parse(dataAux);
			alunos.get(indice).setDtNasc(dtAux);
			break;
		case 4:
			System.out.println("Digite o novo endereço: ");
			String endereco = sc.next();
			alunos.get(indice).setEndereco(endereco);
			break;
		case 5:
			System.out.println("Digite o novo CEP: ");
			String cep = sc.next();
			alunos.get(indice).setCep(cep);
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida. Tente novamente!");
		}




		// Alterando o que foi escolhido
		// 1 - Nome





	}
	public void ExcluirAluno() {
		
	}
	public void ListarAluno() {
		
	}
	public void BuscarAluno() {
		
	}
}
