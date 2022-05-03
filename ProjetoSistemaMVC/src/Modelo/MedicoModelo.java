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
public class MedicoModelo 
{
    private String ID;
    private String userID;
    private String clinID;
    private String espID;
    private String nome;
    private String CRM;

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

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
     * @return the clinID
     */
    public String getClinID() {
        return clinID;
    }

    /**
     * @param clinID the clinID to set
     */
    public void setClinID(String clinID) {
        this.clinID = clinID;
    }

    /**
     * @return the espID
     */
    public String getEspID() {
        return espID;
    }

    /**
     * @param espID the espID to set
     */
    public void setEspID(String espID) {
        this.espID = espID;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
    
}
