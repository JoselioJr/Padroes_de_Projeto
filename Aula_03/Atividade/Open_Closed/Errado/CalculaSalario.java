package Open_Closed.Errado;

public class CalculaSalario {
    // Método com lógica complicada e embaraçosa
    public void calculaSalario(Funcionario funcionario){
        if (funcionario.getNome() == "Analista") {
            System.out.println("Seu salário é R$5.000,00");
        }if (funcionario.getNome() == "Arquiteto") {
            System.out.println("Seu salário é R$7.000,00");
        }else System.out.println("Cargo não encontrado");
    }
}
