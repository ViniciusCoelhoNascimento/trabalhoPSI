/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.state.exemplos.semaforo;

/**
 *
 * @author aluno
 */
public interface Estado {

    public String nome();

    public void troca(Sinaleira sinaleira);
    
}
