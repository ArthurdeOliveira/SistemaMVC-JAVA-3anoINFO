package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoDAO {
        
    public Connection conectaBancoDados() {
           Connection conexao = null;
           
           String driveJBC = "com.mysql.jdbc.Driver";
           String url = "jdbc:mysql://localhost:3306/bdclinica";
           String user = "root";
           String senha = "";

    try {
       
        Class.forName(driveJBC);
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Nome não encontrado");
    }
    
    try {
       
        conexao = DriverManager.getConnection(url,user,senha);      
       
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Falha na Conexao");
    }
     return conexao;
    }
}