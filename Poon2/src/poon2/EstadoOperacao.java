
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
        System.out.println("Rob� (Modo de Opera��o): executando tarefas");
        robo.executarComando(); // Usa os comandos definidos
        robo.setEstado(EstadoEspera.getIntance());
    }

    @Override
    public void ligar(Robo robo) {
        System.out.println("");
    }

    @Override
    public void desligar(Robo robo) {
        System.out.println("Cancelando comandos e desligando");
        robo.setEstado(EstadoDesligado.getIntance());
    }
    
}
