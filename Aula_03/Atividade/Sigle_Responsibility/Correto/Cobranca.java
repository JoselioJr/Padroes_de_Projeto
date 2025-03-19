package Sigle_Responsibility.Correto;

public class Cobranca {
    // Attributos
    private Departamento departamento;

    // Construtor
    public Cobranca(Departamento departamento) {
        this.departamento = departamento;
    }

    // Encapsulamento
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Método Coeso
    public void cobrarMensalidade(){
        System.out.println("Cobrança realizada para fulano de tal");
        System.out.println("Cobrança realizada para fulano de ciclano");
    }
}
