package Atividades;

public abstract class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    private String cpf;
    private int anoDeNascimento;
    private String endereco;

    // Construtor
    public Pessoa(String nome, String sobrenome, String cpf, int anoDeNascimento, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.anoDeNascimento = anoDeNascimento;
        this.endereco = endereco;
    }

    // Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    // Métodos
    public void nomeEmCaixaAlta(){
        System.out.println("Nome em caixa alta: "+this.nome.toUpperCase());
    }

    public void enderecoEmCaixaAlta(){
        System.out.println("Endereço em caixa alta: "+this.endereco.toUpperCase());
    }

    public void seuCpf(){
        System.out.println("O CPF de "+this.nome+" é: "+this.cpf);
    }

    // Métodos abstratos
    public abstract int calcularIdade();
    
    public abstract void nomeCompleto();
}
