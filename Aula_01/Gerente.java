package Atividades;

public class Gerente extends Funcionario implements Autenticavel, Fornecedor, Departamento{

    // Construtor
    public Gerente(String nome, int idade, double salario) {
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

    // Método da Interface Fonecedor
    @Override
    public void realizarPedido() {
        System.out.println("Realizou o pedido 3!");
    }   

    // Métodos da Interface Departamento
    @Override
    public void criaDepartamento() {
        System.out.println("Departamento 2 Criado!");
    }

    @Override
    public void cadastrarFuncionarios() {
        for (int i = 10 ; i < 20 ; i++) {
            System.out.println("Cadastra o funcionario: Funcionario "+i);
        }
    }
}
