package CadastrandoVeiculos;

public class Veiculo {
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo(String modelo, String placa, int ano){
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("=== Veiculo cadastrado ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println();
    }
}
