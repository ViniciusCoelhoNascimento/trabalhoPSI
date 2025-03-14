/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.state.exemplos.semaforo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Vermelho implements Estado{

    @Override
    public String nome() {
        return "Vermelho";
    }

    @Override
    public void troca(Sinaleira sinaleira) {
        
        try {
            Thread.sleep(10000);
            
            
            sinaleira.trocar(new Verde());
        } catch (InterruptedException ex) {
            Logger.getLogger(Vermelho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
