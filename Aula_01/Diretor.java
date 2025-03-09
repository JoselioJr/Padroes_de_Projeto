package Atividades;

public class Diretor extends Funcionario implements Autenticavel, Fornecedor, Departamento{

    // Construtor
    public Diretor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    // Método nulo da classe pai Funcionario
    @Override
    public void comissao(){
        continue;
    }

    // Método da Interface Autenticavel
    @Override
    public void Login() {
        System.out.println("Efetuado o login!");
    }

    // Método da Interface Fornecedor
    @Override
    public void realizarPedido() {
        System.out.println("Realizou o pedido 2!");
    }

    // Métodos da Interface Departamento
    @Override
    public void criaDepartamento() {
        System.out.println("Departamento 1 Criado!");
    }

    @Override
    public void cadastrarFuncionarios() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Cadastra o funcionario: Funcionario "+i);
        }
    }
}
