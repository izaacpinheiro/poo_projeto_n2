
package poon2;

public interface Estado {
    
    // Base da Implementa��o do Padr�o State
    // Usado para definir o comportamento do Robo
    Estado acao (Robo robo);
    Estado ligar();
    Estado desligar();
}
