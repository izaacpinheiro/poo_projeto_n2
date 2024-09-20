
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
    public Estado acao(Robo robo) {
        System.out.println("Robô (Modo de Reparo): Voltando ao Modo de Espera após manutenção");
        System.out.println("-- modo de reparo finalizado --");
        return EstadoEspera.getIntance();
    }

    @Override
    public Estado ligar() {
        System.out.println("Robô (Modo de Manutenção)");
        return this;
    }

    @Override
    public Estado desligar() {
        System.out.println("Impossível desligar o Robô em Modo de Reparo");
        return this;
    }
}
