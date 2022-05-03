/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author arthu
 */
public class UsuarioModelo 
{
    private String userID;
    private String userEmail;
    private String userSenha;
    private String userTipo;

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the userSenha
     */
    public String getUserSenha() {
        return userSenha;
    }

    /**
     * @param userSenha the userSenha to set
     */
    public void setUserSenha(String userSenha) {
        this.userSenha = userSenha;
    }

    /**
     * @return the userTipo
     */
    public String getUserTipo() {
        return userTipo;
    }

    /**
     * @param userTipo the userTipo to set
     */
    public void setUserTipo(String userTipo) {
        this.userTipo = userTipo;
    }
}
