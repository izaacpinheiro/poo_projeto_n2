package poon2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Robo {

    private Estado estadoAtual; // O estado atual do Robô define seu comportamento
    private List<Strategy> comandos = new ArrayList(); // Lista de comando para ser execu
    
    public Robo(){
        estadoAtual = EstadoDesligado.getIntance();
        // requisitar();
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
            System.out.println("Erro ao executar comando! Entrando no Modo de Reparo.");
            setEstado(EstadoReparo.getIntance());  // Muda para o Modo de Meparo
            // requisitar();
        } else {
            if (comandos != null){
                for (Strategy c : comandos)
                    c.executar();
            } else 
                System.out.println("Nenhum comando foi definido.");
        }
        comandos.clear();
    }
    
    public void ligar(){
        estadoAtual = estadoAtual.ligar();
    }
    
    public void desligar(){
        estadoAtual = estadoAtual.desligar();
    }
    
    public void acao(){
        estadoAtual = estadoAtual.acao(this);
    }
    
    // Invoca o compotamento do estado atual
//    public void requisitar() {
//        estadoAtual.estado = ;
//    }
}
