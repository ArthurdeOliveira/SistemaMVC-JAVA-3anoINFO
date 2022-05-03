/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.Connection;
import Controle.SingletonConnection;
import Controle.ConnectionException;
/**
 * @author arthu
 */

public class TestConnection {

    public static void main(String[] args) {

            try {
                Connection con = SingletonConnection.getConnection();
            } catch (ConnectionException e) {
                e.printStackTrace();
            }

    }

}
