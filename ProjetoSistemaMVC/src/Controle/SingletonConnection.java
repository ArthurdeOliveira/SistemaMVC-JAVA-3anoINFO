/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Controle.ConnectionException;
/**
 *
 * @author arthu
 */
public class SingletonConnection {

    private static Connection c;

    private static Connection newConnection() throws ConnectionException {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdclinicas?useTimezone=true&serverTimezone=UTC", "root", "66000912");
            System.out.println("Conexão efetuada com sucesso!\n");
        } catch (SQLException e) {
            throw new ConnectionException("\nErro ao conectar-se ao banco de dados. ", e);
        }
        return con;
    }

    public static Connection getConnection() throws ConnectionException {
        if(c == null) {
            c = newConnection();
        }
        return c;
    }

    public static void closeConnection() throws ConnectionException {
        try {
            c.close();
        } catch (SQLException e) {
            throw new ConnectionException("Erro ao encerrar a conexão. ", e);
        }
        c = null;
    }

}
