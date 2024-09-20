
package poon2;

public class EstadoOperacao implements Estado {
    
    // Integração do Singleton
    private static EstadoOperacao instance = new EstadoOperacao();
    
    // Construtor privado para não ser criado repetidas vezes
    private EstadoOperacao(){}
    
    public static EstadoOperacao getIntance(){
        return instance;
    }
    
    @Override
    public Estado acao(Robo robo) {
        System.out.println("Robô (Modo de Operação): executando comandos");
        robo.executarComando(); // Usa os comandos definidos
        return EstadoEspera.getIntance();
    }

    @Override
    public Estado ligar() {
        System.out.println("Robô já está ligado");
        return this;
    }

    @Override
    public Estado desligar() {
        System.out.println("Cancelando comandos e desligando");
        return EstadoDesligado.getIntance();
    }
    
}
