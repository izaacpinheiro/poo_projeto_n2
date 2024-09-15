package poon2;

import java.util.Random;

public class Robo {

    private Estado estadoAtual = EstadoEspera.getIntance();
    private Strategy comandoAtual;

    public void setEstado(Estado estado) {
        this.estadoAtual = estado;
    }

    public Estado getEstado() {
        return estadoAtual;
    }

    public void setComando(Strategy est) {
        this.comandoAtual = est;
    }

    public Strategy getComando() {
        return comandoAtual;
    }

    public void executarComando() {
        Random random = new Random();
        int chanceDeErro = random.nextInt(10);  // Gera um número entre 0 e 9

        if (chanceDeErro < 2) {  // Simula uma falha em 20% dos casos
            System.out.println("Erro ao executar o comando! Entrando no modo de reparo.");
            setEstado(EstadoReparo.getIntance());  // Muda para o modo de reparo
        } else {
            if (comandoAtual != null) {
                comandoAtual.executar();
            } else {
                System.out.println("Nenhuma Comando foi definido.");
            }
        }
    }
    
    // Invoca o compotamento do Estado atual
    public void requisitar() {
        estadoAtual.estado(this);
    }
}
