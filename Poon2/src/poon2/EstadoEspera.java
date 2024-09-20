
package poon2;

public class EstadoEspera implements Estado{
    
    // Integra��o do Singleton
    private static EstadoEspera instance = new EstadoEspera();
    
    // Construtor privado para n�o ser criado repetidas vezes
    private EstadoEspera(){}
    
    public static EstadoEspera getIntance(){
        return instance;
    }
    
    @Override
    public Estado acao(Robo robo) {
        System.out.println("Rob� (Modo de Espera): aguardando comandos");
        return this;
    }

    @Override
    public Estado ligar() {
        System.out.println("Rob� j� est� ligado. Aguardando comandos");
        return this;
    }

    @Override
    public Estado desligar() {
        System.out.println("Rob� desligando");
        return EstadoDesligado.getIntance();
    }
}
