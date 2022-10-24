package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lancamento extends Thread {

    
    private LadoMoeda moeda;    // null
    private String face;    

    Lancamento(LadoMoeda moeda, String face) {
        this.moeda = moeda;
        this.face = face;
    }

    @Override
    public void run() {
        
        // Sleep valor aleatório 
        int soneca = (int) (Math.random() * 30);
    
        while (true) {
            // Colocado Cara/Coroa na face da moeda
            this.moeda.setFace(this.face);
            
            System.out.println(moeda.getFace());
 
            try {
                sleep(soneca);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lancamento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
