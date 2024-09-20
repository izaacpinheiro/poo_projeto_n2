
package poon2;

public interface Estado {
    
    // Base da Implementação do Padrão State
    // Usado para definir o comportamento do Robo
    Estado acao (Robo robo);
    Estado ligar();
    Estado desligar();
}
