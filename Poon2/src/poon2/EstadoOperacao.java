
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
    public void estado(Robo robo) {
        System.out.println("Robo em modo de execu��o. Executando tarefas");
        robo.executarComando(); // Usa o comando definido
        robo.setEstado(EstadoEspera.getIntance());
    }
    
}
