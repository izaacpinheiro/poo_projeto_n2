
package poon2;

public class Teste {

    public static void main(String[] args) {
        
        // Inicializando em Modo de Espera
        Robo r1 = new Robo();
        
        // Definindo Comando
        r1.setComando(new ComandoLimpeza());
        r1.setComando(new ComandoDancar());
        r1.setComando(new ComandoEntrega());
        r1.requisitar();
        
        r1.requisitar();
        
        r1.setComando(new ComandoDancar());
        r1.requisitar();
    }
}
