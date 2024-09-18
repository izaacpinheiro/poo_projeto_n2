
package Statemario;

public class TesteMario {
    public static void main(String[] args) {
        Mario mario = new Mario();
        
        mario.pegarCogumelo();
        mario.pegarCogumelo();
        mario.levarDano();
        mario.pegarCogumelo();
        mario.pegarFlor();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
    }
}
