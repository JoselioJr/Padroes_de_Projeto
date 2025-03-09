package Atividades;
import java.time.LocalDate;

public class Cliente extends Pessoa implements Autenticavel {
    // Construtor
    public Cliente(String nome, String sobrenome, String cpf, int anoDeNascimento, String endereco) {
            super(nome, sobrenome, cpf, anoDeNascimento, endereco);
        }
    
    // Método da Interface Autenticavel
    @Override
    public void Login() {
        System.out.println("Efetuado o login!");
    }

    // Métodos da Classe pai Pessoa
    @Override
    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - getAnoDeNascimento();
        
        return idade;
    }
    
    @Override
    public void nomeCompleto(){
        System.out.println("Nome Completo: "+(getNome()+" "+getSobrenome()));
    }
}
