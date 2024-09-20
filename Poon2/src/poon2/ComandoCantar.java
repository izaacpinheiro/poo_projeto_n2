
package poon2;


public class ComandoCantar implements Strategy {

    @Override
    public void executar() {
        System.out.println("> Robô está cantando (insira uma musica aqui).");
    }
}
