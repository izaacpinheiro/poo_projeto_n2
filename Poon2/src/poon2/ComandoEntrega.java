
package poon2;

public class ComandoEntrega implements Strategy {

    @Override
    public void executar() {
        System.out.println("> Robô está entregando o objeto.");
    }
}
