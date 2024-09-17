
package poon2;

public class EstadoDesligado implements Estado {
    
    // Integra��o do Singleton
    private static EstadoDesligado instance = new EstadoDesligado();
    
    // Construtor privado para n�o ser criado repetidas vezes
    private EstadoDesligado(){}
    
    public static EstadoDesligado getIntance(){
        return instance;
    }

    @Override
    public void estado(Robo robo) {
        System.out.println("Rob� est� desligado.");
    }

    @Override
    public void ligar(Robo robo) {
        // Ligar Robo
    }

    @Override
    public void desligar(Robo robo) {
        // Robo ja est� desligado
    }
    
}
