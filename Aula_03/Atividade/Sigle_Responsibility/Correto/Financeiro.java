package Sigle_Responsibility.Correto;

public class Financeiro {
    // Atributos
    private Departamento departamento;

    // Construtor
    public Financeiro(Departamento departamento) {
        this.departamento = departamento;
    }

    // Encapsulamento
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    // Métodos coesos
    public void pagamentoFuncionario(){
        System.out.println("Pagamento efetuado para professores de R$1.512,00");
        System.out.println("Pagamento efetuado para zelador de R$3.000,00");
    }

    public void compraDeMaterial(){
        System.out.println("Compra realizada de Material x");
        System.out.println("Compra realizada de Material y");
    }
}
