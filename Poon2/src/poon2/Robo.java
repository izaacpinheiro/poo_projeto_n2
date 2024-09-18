package poon2;

import java.util.Random;

public class Robo {

    private Estado estadoAtual;
    private Strategy comandoAtual; //Pode ser uma lista que pode receber varios comando ao mesmo tempo
    
    public Robo(){
        estadoAtual = EstadoEspera.getIntance();
        requisitar();
    }

    public void setEstado(Estado estado) {
        this.estadoAtual = estado;
    }

    public Estado getEstado() {
        return estadoAtual;
    }

    public void setComando(Strategy est) {
        this.comandoAtual = est;
        setEstado(EstadoOperacao.getIntance());
    }

    public Strategy getComando() {
        return comandoAtual;
    }

    public void executarComando() {
        Random random = new Random();
        int chanceDeErro = random.nextInt(10); // Gera um número de 0 a 9

        if (chanceDeErro < 1) {  // Simula uma falha em 10% dos casos
            System.out.println("Erro ao executar o comando! Entrando no modo de reparo.");
            setEstado(EstadoReparo.getIntance());  // Muda para o modo de reparo
            requisitar();
        } else {
            if (comandoAtual != null)
                comandoAtual.executar();
            else 
                System.out.println("Nenhuma comando foi definido.");
        }
    }
    
    // Invoca o compotamento do estado atual
    public void requisitar() {
        estadoAtual.estado(this);
    }
}
