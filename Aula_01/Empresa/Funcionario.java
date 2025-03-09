package Atividades;

public abstract class Funcionario {
    // Atributos
    private String nome;
    private int idade;
    private double salario;

    // Construtor
    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    // Métodos
    public void calcSalario(){
        System.out.println("O salário de "+this.nome+" é: "+this.salario);
    }

    public void comissao(double comissao){
        System.out.println("A comissao de "+this.nome+" é: "+(comissao+this.salario));
    }
}