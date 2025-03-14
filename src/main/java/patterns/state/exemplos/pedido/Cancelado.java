
package patterns.state.exemplos.pedido;


public class Cancelado implements Estado {

    @Override
    public void concluir(Pedido pedido) {
        System.out.println("um pedido cancelado nao pode ser concluido");
        
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("pedido ja cancelado");
    }

   
    
}
