package ValidacaoDeLogin;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String usuario, String senha){
        return usuario.equals(this.login) && senha.equals(this.senha);
    }
}
