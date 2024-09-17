
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
        System.out.println("Robô em modo de espera. Aguardando comandos.");
        // robo.setEstado(EstadoOperacao.getIntance()); -> mudar para o setComando do Robo
    }

    @Override
    public void ligar(Robo robo) {
        System.out.println("Robô já está ligado. Aguardando comando");
    }

    @Override
    public void desligar(Robo robo) {
        System.out.println("Robô desligado.");
    }
}
