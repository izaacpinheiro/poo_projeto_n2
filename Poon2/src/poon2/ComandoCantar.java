
package poon2;


public class ComandoCantar implements Strategy {

    @Override
    public void executar() {
        System.out.println("> Rob� est� cantando (insira uma musica aqui).");
    }
}
