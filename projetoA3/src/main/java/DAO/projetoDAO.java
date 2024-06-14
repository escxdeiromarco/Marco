package DAO;

import DTO.ProjetoDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class projetoDAO {

    Connection conn;
    PreparedStatement pstmprojeto;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();

    public void cadastroProjeto(ProjetoDTO objcadprojetodto) {
        String sql = "insert into projetos (responsavel, descricao, conteudo, ODS, ) values (?, ?, ?, ?) ";

        conn = new conexaoDAO().conectaBD();

        try {

            pstmprojeto = conn.prepareStatement(sql);
            pstmprojeto.setString(1, objcadprojetodto.getResponsavel());
            pstmprojeto.setString(2, objcadprojetodto.getDescricao());
            pstmprojeto.setString(3, objcadprojetodto.getConteudo());
            pstmprojeto.setString(4, objcadprojetodto.getODS());

            pstmprojeto.execute();
            pstmprojeto.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProjetoDAO cadprojeto " + erro);

        }

    }
        
    
    
    
    
    
    }
        
        
   
