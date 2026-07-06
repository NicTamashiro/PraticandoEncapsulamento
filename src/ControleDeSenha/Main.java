package ControleDeSenha;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("123456");
        user.setSenha("123456", "abc123");
        System.out.println("Nova senha: " + user.getSenha());
    }
}
