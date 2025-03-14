
package patterns.state.exemplos.pedido;


public class Pedido {
    
    private Estado estado;

    public Pedido() {
        this.estado = new Andamento();
    }
    
    
    public void concluir(){
        this.estado.concluir(this);
    }
    
     public void cancelar(){
         this.estado.cancelar(this);
        
    }
     
     public void mudarEstado(Estado estado){
         this.estado = estado;
     }
     
      
        
    
            
    
}
