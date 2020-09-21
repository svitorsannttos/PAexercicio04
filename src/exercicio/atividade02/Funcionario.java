
package exercicio.atividade02;

import java.util.ArrayList;

public class Funcionario {
    private int matricula;
    private String nome;
    private static ArrayList<Funcionario> listFuncionario = new ArrayList();
    
    public Funcionario(String nome, int matricula) {
        this.matricula = matricula;
        this.nome = nome;
        this.listFuncionario.add(this);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static ArrayList<Funcionario> getListFuncionario() {
        return listFuncionario;
    }

    public static void setListFuncionario(ArrayList<Funcionario> listFuncionario) {
        Funcionario.listFuncionario = listFuncionario;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nMatricula: " + this.matricula;
    }
    
    
}
