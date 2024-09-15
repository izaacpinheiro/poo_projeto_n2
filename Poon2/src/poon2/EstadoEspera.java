
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
    public void estado(Robo robo) {
        System.out.println("O robo está em modo de espera. Aguardando comandos.");
        robo.setEstado(EstadoOperacao.getIntance());
    }
}
