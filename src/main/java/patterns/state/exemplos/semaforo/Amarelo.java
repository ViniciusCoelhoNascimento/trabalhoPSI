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
public class Amarelo implements Estado{
    
        @Override
    public String nome() {
        return "Amarelo";
    }

    @Override
    public void troca(Sinaleira sinaleira) {
        sinaleira.trocar(new Vermelho());
        
    }
    
}
