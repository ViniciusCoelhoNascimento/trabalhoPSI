/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.state.exemplos.pedido;

/**
 *
 * @author aluno
 */
public interface Estado {
    
    void concluir(Pedido pedido);
    void cancelar(Pedido pedido);
    
}
