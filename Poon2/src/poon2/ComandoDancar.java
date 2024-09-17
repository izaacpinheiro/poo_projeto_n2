
package poon2;

public class ComandoDancar implements Strategy {

    @Override
    public void executar() {
        System.out.println("> Robô está dançando freneticamente!");
    }
    
}
