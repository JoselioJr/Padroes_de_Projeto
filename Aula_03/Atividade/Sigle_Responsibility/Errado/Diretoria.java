package Sigle_Responsibility.Errado;
import java.util.ArrayList;

class Diretoria {
    // Atributos
    private ArrayList<Aluno> listaDeAlunos;
    private Departamento departamento;

    // Construtor
    public Diretoria(ArrayList<Aluno> listaDeAlunos, Departamento departamento) {
        this.listaDeAlunos = listaDeAlunos;
        this.departamento = departamento;
    }

    // Encapsulamento
    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Métodos coesos
    public void adicionarAluno(Aluno aluno){
        this.listaDeAlunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        this.listaDeAlunos.remove(aluno);
    }

    // Métodos fora da coesão de acordo com a classe Diretoria. Coesos para a classe Financeiro
    public void pagamentoFuncionario(){
        System.out.println("Pagamento efetuado para professores de R$1.512,00");
        System.out.println("Pagamento efetuado para zelador de R$3.000,00");
    }

    public void compraDeMaterial(){
        System.out.println("Compra realizada de Material x");
        System.out.println("Compra realizada de Material y");
    }

    // Método fora da coesão de acordo com a classe Diretoria. Coeso para a classe Cobranca
    public void cobrarMensalidade(){
        System.out.println("Cobrança realizada para fulano de tal");
        System.out.println("Cobrança realizada para fulano de ciclano");
    }
}