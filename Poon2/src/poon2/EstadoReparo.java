
package poon2;

public class EstadoReparo implements Estado {
    
    // Integração do Singleton
    private static EstadoReparo instance = new EstadoReparo();
    
    // Construtor privado para não ser criado repetidas vezes
    private EstadoReparo(){}
    
    public static EstadoReparo getIntance(){
        return instance;
    }
    
    @Override
    public void estado(Robo robo) {
        System.out.println("Robô está em modo de repado. Voltando ao Modo Espera após manutenção.");
        System.out.println("-- modo de reparo finalizado --");
        robo.setEstado(EstadoEspera.getIntance());
    }

    @Override
    public void ligar(Robo robo) {
        System.out.println("");
    }

    @Override
    public void desligar(Robo robo) {
        System.out.println("Impossível desligar o Robô em modo de reparo");
    }
    
}
