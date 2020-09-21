
package exercicio.atividade02;

public class Main {

    public static void main(String[] args) {
        Impressora impressora = Impressora.getInstace();
        Funcionario pedro = new Funcionario("Pedro", 12);
        Funcionario pedro1 = new Funcionario("Vitor", 16);
        
        impressora.print(12);

    }
    
}
