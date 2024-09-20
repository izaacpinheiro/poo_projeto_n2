
package poon2;

public class Teste {

    public static void main(String[] args) {
        
        // Inicializando Rob� em Modo Desligado
        Robo r1 = new Robo();
        
        r1.ligar(); // Ligando o Rob�
        System.out.println(r1.getEstado().getClass().getName());;
        r1.acao(); // Invocando a a��o do Estado Atual
        
        // Atribuindo Comandos ao Rob�
        r1.setComando(new ComandoDancar());
        r1.setComando(new ComandoLimpeza());
        r1.setComando(new ComandoCantar());
        System.out.println(r1.getEstado().getClass().getName());;
        r1.acao(); // Executando os Comandos Atribuidos
        
        // Invocando a��o do Estado Atual
        r1.acao();
        System.out.println(r1.getEstado().getClass().getName());;
        
        r1.desligar();
        System.out.println(r1.getEstado().getClass().getName());;
        
        r1.ligar();
        System.out.println(r1.getEstado().getClass().getName());;
        
        r1.setComando(new ComandoLimpeza());
        r1.acao(); // Executando os Comandos Atribuidos
        
    }
}
