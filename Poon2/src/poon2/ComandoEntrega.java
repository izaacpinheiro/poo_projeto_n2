
package poon2;

public class ComandoEntrega implements Strategy {

    @Override
    public void executar() {
        System.out.println("> Rob� est� entregando o objeto.");
    }
}
