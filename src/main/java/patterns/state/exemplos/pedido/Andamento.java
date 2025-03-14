
package patterns.state.exemplos.pedido;


public class Andamento implements Estado{

    @Override
    public void concluir(Pedido pedido) {
        pedido.mudarEstado(new Concluido());
        
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.mudarEstado(new Cancelado());

    }
    
}
