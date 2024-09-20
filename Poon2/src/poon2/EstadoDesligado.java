
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
    public Estado acao(Robo robo) {
        System.out.println("Robô (Modo Desligado)");
        return this;
    }

    @Override
    public Estado ligar() {
        System.out.println("Robô ligado - Estrando em Modo de Espera");
        return EstadoEspera.getIntance();
    }

    @Override
    public Estado desligar() {
        System.out.println("Robô está desligado");
        return this;
    }
}
