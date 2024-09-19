package poon2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Robo {

    private Estado estadoAtual;
    private List<Strategy> comandos = new ArrayList();
    
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
        comandos.add(est);
        setEstado(EstadoOperacao.getIntance());
    }

    public void executarComando() {
        Random random = new Random();
        int chanceDeErro = random.nextInt(10); // Gera um número de 0 a 9

        if (chanceDeErro < 1) {  // Simula uma falha em 10% dos casos
            System.out.println("Erro ao executar o comando! Entrando no Modo de Reparo.");
            setEstado(EstadoReparo.getIntance());  // Muda para o modo de reparo
            requisitar();
        } else {
            if (comandos != null){
                // comandoAtual.executar();
                for (Strategy c : comandos)
                    c.executar();
            } else 
                System.out.println("Nenhum comando foi definido.");
        }
        comandos.clear();
    }
    
    // Invoca o compotamento do estado atual
    public void requisitar() {
        estadoAtual.estado(this);
    }
}
