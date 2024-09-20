
package poon2;

public class EstadoEspera implements Estado{
    
    // Integração do Singleton
    private static EstadoEspera instance = new EstadoEspera();
    
    // Construtor privado para não ser criado repetidas vezes
    private EstadoEspera(){}
    
    public static EstadoEspera getIntance(){
        return instance;
    }
    
    @Override
    public Estado acao(Robo robo) {
        System.out.println("Robô (Modo de Espera): aguardando comandos");
        return this;
    }

    @Override
    public Estado ligar() {
        System.out.println("Robô já está ligado. Aguardando comandos");
        return this;
    }

    @Override
    public Estado desligar() {
        System.out.println("Robô desligando");
        return EstadoDesligado.getIntance();
    }
}
