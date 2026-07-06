package ValidacaoDeLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario user = new Usuario("aluno2025", "escola@123");
        int tentativas = 3;

        while (tentativas > 0){
            System.out.println("Digite o seu usuario: ");
            String usuario = scanner.nextLine();

            System.out.println("Digite a sua senha: ");
            String senha = scanner.nextLine();

            if(user.validarSenha(usuario, senha)){
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativas--;
                if(tentativas == 0){
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
                }
            }
        }
        scanner.close();
    }
}
