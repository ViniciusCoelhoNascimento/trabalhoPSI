
package patterns.state.exemplos.pedido;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
        pedido.cancelar();
        pedido.concluir();
    }
}
