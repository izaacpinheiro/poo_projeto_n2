
package poon2;

public class EstadoDesligado implements Estado {
    
    // Integração do Singleton
    private static EstadoDesligado instance = new EstadoDesligado();
    
    // Construtor privado para não ser criado repetidas vezes
    private EstadoDesligado(){}
    
    public static EstadoDesligado getIntance(){
        return instance;
    }

    @Override
    public void estado(Robo robo) {
        System.out.println("Robô está desligado.");
    }

    @Override
    public void ligar(Robo robo) {
        // Ligar Robo
    }

    @Override
    public void desligar(Robo robo) {
        // Robo ja está desligado
    }
    
}
