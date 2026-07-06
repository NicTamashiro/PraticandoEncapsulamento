package CadastroDeProdutosComValidacao;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Mouse");
        produto1.setPreco(-50.00);

        produto1.exibe();
    }
}
