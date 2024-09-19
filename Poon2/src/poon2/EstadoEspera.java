
package poon2;

public class EstadoEspera implements Estado{
    
    // Integra��o do Singleton
    private static EstadoEspera instance = new EstadoEspera();
    
    // Construtor privado para n�o ser criado repetidas vezes
    private EstadoEspera(){}
    
    public static EstadoEspera getIntance(){
        return instance;
    }
    
    @Override
    public void estado(Robo robo) {
        System.out.println("Rob� (Modo de Espera): aguardando comandos");
    }

    @Override
    public void ligar(Robo robo) {
        System.out.println("Rob� j� est� ligado. Aguardando comando");
    }

    @Override
    public void desligar(Robo robo) {
        System.out.println("Rob� desligado");
        robo.setEstado(EstadoDesligado.getIntance());
    }
}
