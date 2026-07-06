package ControleNivelBateria;

public class Bateria {
    private int nivel;

    public void setNivel(int nivel){
        if(nivel > 0 && nivel < 100){
            this.nivel = nivel;
        }
    }

    public void exibirStatusBateria(){
        if(nivel <= 20){
            System.out.println("Status: Bateria fraca");
        } else if(nivel >= 21 && nivel <= 79){
            System.out.println("Status: Bateria ok");
        } else {
            System.out.println("Status: Bateria cheia");
        }
    }
}
