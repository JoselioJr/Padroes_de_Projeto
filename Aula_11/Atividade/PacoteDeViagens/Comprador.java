public class Comprador {
    String nome;
    String cpf;

    public Comprador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}
