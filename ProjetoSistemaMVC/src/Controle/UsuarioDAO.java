package Controle;

import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection connection;
    Long id;
    String email;
    String senha;
    String tipo_usuario;

    public UsuarioDAO() {
        this.connection = new ConexaoDAO().conectaBancoDados();
    }

    public void salvar(Usuario objUsuario) {
        try {
            String sql;
            if (String.valueOf(objUsuario.getId()).isEmpty()) {
                sql = "INSERT INTO usuario(email,senha,tipo_usuario) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objUsuario.getEmail());
                stmt.setString(2, objUsuario.getSenha());
                stmt.setString(3, objUsuario.getTipo_usuario());
                stmt.execute();
                stmt.close();

            } else {
                sql = "UPDATE usuario SET email = ?, senha = ?, tipo_usuario = ? WHERE usuario.id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(4, objUsuario.getId());
                stmt.setString(1, objUsuario.getEmail());
                stmt.setString(2, objUsuario.getSenha());
                stmt.setString(3, objUsuario.getTipo_usuario());
                
                stmt.execute();
                stmt.close();

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList buscar(Usuario objUsuario) {
        try {
            String sql = "";
            if (!objUsuario.getEmail().isEmpty()) {
                sql = "SELECT * FROM usuario WHERE email LIKE '%" + objUsuario.getEmail() + "%' ";

            } else if (!objUsuario.getSenha().isEmpty()) {
                sql = "SELECT * FROM usuario WHERE senha LIKE '%" + objUsuario.getSenha() + "%' ";
            }
            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("tipo_usuario")
                    
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }

    }

    public void deletar(Usuario objUsuario) {
        try {
            String sql;
            if (!String.valueOf(objUsuario.getId()).isEmpty()) {
                sql = "DELETE FROM usuario WHERE usuario.id = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objUsuario.getId());
                stmt.execute();
                stmt.close();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList listarTodos() {
        try {

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("tipo_usuario")
               
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }

    public static void testarConexao() throws SQLException {
        try (Connection objConnection = new ConexaoDAO().conectaBancoDados()) {
            JOptionPane.showMessageDialog(null, "Conex�o realizada com sucesso! ");
        }
    }

}
