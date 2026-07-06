package CadastroDeProdutosComValidacao;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            System.out.println("Preco invalido.");
        } else {
            this.preco = preco;
        }
    }

    public void exibe(){
        System.out.printf("Produto: %s\nPreço: %.2f\n", nome, preco);
    }
}
