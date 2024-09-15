
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
        System.out.println("Robo est� em modo de repado. Voltando ao Modo Espera ap�s manuten��o.");
        robo.setEstado(EstadoEspera.getIntance());
    }
    
}
