package br.edu.faeterj;

public class Testes {
    
    // Criando os elementos da classe Aluno
    private String nome;
    private String cpf;
    private String dtNasc;
    private String matricula;
    private String endereco;
    private String cep;

    // Criando os elementos da classe Menu
    private int opcao = 0;
    private ArrayList<Aluno> alunos = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    private char resposta = 'S';

    // Funções da classe
    public void Processamento() {
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

            switch(opcao) {
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
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 6);
    }

    public void IncluirAluno() {
        System.out.println("Digite o nome do aluno: ");
        nome = sc.next();
        System.out.println("Digite o CPF do aluno: ");
        cpf = sc.next();
        System.out.println("Digite a data de nascimento do aluno: ");
        dtNasc = sc.next();
        System.out.println("Digite a matrícula do aluno: ");
        matricula = sc.next();
        System.out.println("Digite o endereço do aluno: ");
        endereco = sc.next();
        System.out.println("Digite o CEP do aluno: ");
        cep = sc.next();

        Aluno aluno = new Aluno(nome, cpf, dtNasc, matricula, endereco, cep);
        alunos.add(aluno);
    }

}
