package patterns.decorator.exemplos.autenticacao;

public class Main {

    public static void main(String[] args) {

        AutenticarUsuario autenticarUsuario = new AutenticarUsuario(new Item());
        autenticarUsuario.cancelarItem();


    }
}
