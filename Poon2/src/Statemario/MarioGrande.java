
package Statemario;

public class MarioGrande implements MarioState {

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
        System.out.println("Mario com Capa");
        return new MarioFogo();
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario Pequeno");
        return new MarioPequeno();
    }
    
}
