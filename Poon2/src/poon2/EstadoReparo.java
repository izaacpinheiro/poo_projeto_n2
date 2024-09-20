
package poon2;

public class EstadoReparo implements Estado {
    
    // Integra��o do Singleton
    private static EstadoReparo instance = new EstadoReparo();
    
    // Construtor privado para n�o ser criado repetidas vezes
    private EstadoReparo(){}
    
    public static EstadoReparo getIntance(){
        return instance;
    }
    
    @Override
    public Estado acao(Robo robo) {
        System.out.println("Rob� (Modo de Reparo): Voltando ao Modo de Espera ap�s manuten��o");
        System.out.println("-- modo de reparo finalizado --");
        return EstadoEspera.getIntance();
    }

    @Override
    public Estado ligar() {
        System.out.println("Rob� (Modo de Manuten��o)");
        return this;
    }

    @Override
    public Estado desligar() {
        System.out.println("Imposs�vel desligar o Rob� em Modo de Reparo");
        return this;
    }
}
