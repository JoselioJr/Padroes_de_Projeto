package Atividades;

public class Secretario extends Funcionario {

    // Construtor
    public Secretario(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    // Método nulo da classe pai Funcionario
    @Override
    public void comissao(){
        continue;
    }
}
