
package poon2;

public class ComandoEntrega implements Strategy {

    @Override
    public void executar() {
        System.out.println("O robo est� entregando o objeto");
    }
    
}
