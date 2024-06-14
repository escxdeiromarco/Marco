package DTO;


public class UsuarioDTO {
    
    private String nomeUsuario;
    private String nomecompleto;
    private String eMail;
    private String telefone;
    private String senha;
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNomeusuario() {
        return nomeUsuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeUsuario = nomeusuario;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
