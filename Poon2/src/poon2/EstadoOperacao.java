
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
    public void estado(Robo robo) {
        System.out.println("Robo em modo de execução. Executando tarefas");
        robo.executarComando(); // Usa o comando definido
        robo.setEstado(EstadoEspera.getIntance());
    }
    
}
