package Controle;

import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginDAO {
    
    Connection conexao;
    
    public ResultSet autenticacaoUsuario(Login objusuariomodelo){
       conexao = new ConexaoDAO().conectaBancoDados();
    try {
        String sql = "select * from usuario where email = ? and senha = ?";
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setString(1,objusuariomodelo.getEmail_usuario());
        pstm.setString(2,objusuariomodelo.getSenha_usuario());
                
        ResultSet rs = pstm.executeQuery();
        return rs;
    } catch (SQLException erro){
        JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
        return null;
    }   
    }    
}
