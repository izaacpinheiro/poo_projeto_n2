
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
    public Estado acao(Robo robo) {
        System.out.println("Rob� (Modo Desligado)");
        return this;
    }

    @Override
    public Estado ligar() {
        System.out.println("Rob� ligado - Estrando em Modo de Espera");
        return EstadoEspera.getIntance();
    }

    @Override
    public Estado desligar() {
        System.out.println("Rob� est� desligado");
        return this;
    }
}
