
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
    public void estado(Robo robo) {
        System.out.println("Robo está em modo de repado. Voltando ao Modo Espera após manutenção.");
        robo.setEstado(EstadoEspera.getIntance());
    }
    
}
