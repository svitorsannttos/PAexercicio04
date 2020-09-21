
package exercicio.atividade02;

import java.util.Iterator;

public class Impressora {
    private static Impressora impressora = null;
    private String marca, enderecoip;
    private int numerodaporta;
    
    private Impressora() {
        this.marca = "HP Deskjet F300 Series";
        this.enderecoip = "10.211.55.1";
        this.numerodaporta = 9100;
    }
    
    public boolean print (int matricula){
        Iterator<Funcionario> iterator = Funcionario.getListFuncionario().iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getMatricula() == matricula){
                System.out.println("Matricula aprovado, impressora liberada");
                return true;
            }
        }
        return false;
    }
    
    public static Impressora getInstace(){
        if(Impressora.impressora == null){
            Impressora.impressora = new Impressora();
        }
        return Impressora.impressora;
    }

    @Override
    public String toString() {
        return "Impressora{" + "marca=" + marca + ", enderecoip=" + enderecoip + ", numerodaporta=" + numerodaporta + '}';
    }
    
    
    }