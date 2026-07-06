package ControleDeSenha;

public class Usuario {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public void setSenha(String senha, String novaSenha) {
        if(senha.equalsIgnoreCase(this.senha)){
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }
    }

    public String getSenha() {
        return senha;
    }
}
