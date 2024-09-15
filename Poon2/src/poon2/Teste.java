
package poon2;

public class Teste {

    public static void main(String[] args) {
        Robo r1 = new Robo();
        
        // Inicializando em Modo de Espera e muda para Modo de Operacao
        r1.requisitar();
        
        // Definindo Comando
        r1.setComando(new ComandoLimpeza());
        r1.requisitar();
        
        r1.requisitar();
    }
}
