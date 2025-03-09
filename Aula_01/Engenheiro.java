package Atividades;

public class Engenheiro extends Funcionario implements Fornecedor{

    // Construtor
    public Engenheiro(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    // Método da Interface Fornecedor
    @Override
    public void realizarPedido() {
        System.out.println("Realizou o pedido 1!");
    }
}
