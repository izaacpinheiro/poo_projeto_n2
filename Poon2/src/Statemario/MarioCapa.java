
package Statemario;

public class MarioCapa implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("+ 1000 pontos!");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario com Fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("+ 1000 pontos!");
        return this;
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
    
}
