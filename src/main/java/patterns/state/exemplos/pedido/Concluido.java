
package patterns.state.exemplos.pedido;

/**
 *
 * @author aluno
 */
public class Concluido implements Estado{

    @Override
    public void concluir(Pedido pedido) {
        System.out.println("pedido ja concluido");
       
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("pedido ja concluido, nao posso cancelar");

    }
    
}
