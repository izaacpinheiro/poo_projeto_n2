
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
    public void estado(Robo robo) {
        System.out.println("Rob� est� em modo de repado. Voltando ao Modo Espera ap�s manuten��o.");
        System.out.println("-- modo de reparo finalizado --");
        robo.setEstado(EstadoEspera.getIntance());
    }

    @Override
    public void ligar(Robo robo) {
        System.out.println("");
    }

    @Override
    public void desligar(Robo robo) {
        System.out.println("Imposs�vel desligar o Rob� em modo de reparo");
    }
    
}
