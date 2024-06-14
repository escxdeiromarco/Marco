package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroDAO {

    Connection conn;
    PreparedStatement pstmcad;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();

    public void cadastroUsuario(UsuarioDTO objcadusuariodto) {
        String sql = "insert into usuarioscad (nomeusuario, nomecompleto, eMail, telefone, senha) values (?, ?, ?, ?, ?) ";

        conn = new conexaoDAO().conectaBD();

        try {

            pstmcad = conn.prepareStatement(sql);
            pstmcad.setString(1, objcadusuariodto.getNomeusuario());
            pstmcad.setString(2, objcadusuariodto.getNomecompleto());
            pstmcad.setString(3, objcadusuariodto.geteMail());
            pstmcad.setString(4, objcadusuariodto.getTelefone());
            pstmcad.setString(5, objcadusuariodto.getSenha());

            pstmcad.execute();
            pstmcad.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO cadastro " + erro);

        }

    }

    public ArrayList<UsuarioDTO> pesquisaUsuario() {
        String sql = "select * from usuarioscad";

        try {
            pstmcad = conn.prepareStatement(sql);
            rs = pstmcad.executeQuery();
            while (rs.next()) {
                UsuarioDTO objcadusuariodto = new UsuarioDTO();
                objcadusuariodto.setNomeusuario(rs.getString("nomeusuario"));
                objcadusuariodto.setTelefone(rs.getNString("telefone"));

                lista.add(objcadusuariodto);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO pesquisar " + erro);

        }
        return lista;
    }

    public void alterarUsuario(UsuarioDTO objalterarusuariodto) {
        String sql = "Update usuarioscad set nomecompleto = ?, eMail = ?, telefone = ?, senha = ? where nomeusuario = ? ";

        conn = new conexaoDAO().conectaBD();

        try {

            pstmcad = conn.prepareStatement(sql);
            pstmcad.setString(1, objalterarusuariodto.getNomeusuario());
            pstmcad.setString(2, objalterarusuariodto.getNomecompleto());
            pstmcad.setString(3, objalterarusuariodto.geteMail());
            pstmcad.setString(4, objalterarusuariodto.getTelefone());
            pstmcad.setString(5, objalterarusuariodto.getSenha());

            pstmcad.execute();
            pstmcad.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO alterar " + erro);
        }

    }

}
