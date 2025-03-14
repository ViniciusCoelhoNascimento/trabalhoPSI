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
public class Sinaleira {
    private Estado estado;

    public Sinaleira() {
        this.estado = new Vermelho();
    }
    
    public void ligar(){
        for (int i = 0; i < 10; i++) {
            System.out.println(estado.nome());
            estado.troca(this);
        }
    }
    
   
    public void trocar(Estado estado) {
        this.estado = estado;
        
    }
    
    
    
}
