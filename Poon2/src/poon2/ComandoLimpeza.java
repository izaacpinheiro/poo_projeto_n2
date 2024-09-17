
package poon2;

public class ComandoLimpeza implements Strategy {

    @Override
    public void executar() {
        System.out.println("> Robô está limpando.");
    }
}
