package Sigle_Responsibility.Correto;
import java.util.ArrayList;

public class Diretoria {
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
}
