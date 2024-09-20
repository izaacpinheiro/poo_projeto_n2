
package poon2;

public class EstadoOperacao implements Estado {
    
    // Integra��o do Singleton
    private static EstadoOperacao instance = new EstadoOperacao();
    
    // Construtor privado para n�o ser criado repetidas vezes
    private EstadoOperacao(){}
    
    public static EstadoOperacao getIntance(){
        return instance;
    }
    
    @Override
    public Estado acao(Robo robo) {
        System.out.println("Rob� (Modo de Opera��o): executando comandos");
        robo.executarComando(); // Usa os comandos definidos
        return EstadoEspera.getIntance();
    }

    @Override
    public Estado ligar() {
        System.out.println("Rob� j� est� ligado");
        return this;
    }

    @Override
    public Estado desligar() {
        System.out.println("Cancelando comandos e desligando");
        return EstadoDesligado.getIntance();
    }
    
}
