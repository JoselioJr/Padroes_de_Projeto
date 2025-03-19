package Sigle_Responsibility.Correto;

public class Aluno {
    // Atributos
    private String nome;
    private int anoNascimento;
    private String endereco;

    // Construtor
    public Aluno(String nome, int anoNascimento, String endereco) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.endereco = endereco;
    }

    // Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
