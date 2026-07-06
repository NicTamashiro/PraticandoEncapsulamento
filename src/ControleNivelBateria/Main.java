package ControleNivelBateria;

import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        bateria.setNivel(85);

        bateria.exibirStatusBateria();
    }
}
