/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Business;

import gencost_cdgi.DAO.ConexaoDB;
import gencost_cdgi.Gencost_CDGI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caiod
 */
public class Business {

    public boolean validaUser(String Email, String Senha) {
        ConexaoDB conect = new ConexaoDB();
        try {

            ResultSet resultSet = conect.getUsuario();
            while (resultSet.next()) {
                if (resultSet.getString(2).equals(Email) && resultSet.getString(4).equals(Senha)) {
                    return true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean validaUser(String Email) {
        ConexaoDB conect = new ConexaoDB();
        try {

            ResultSet resultSet = conect.getUsuario();
            while (resultSet.next()) {
                if (resultSet.getString(2).equals(Email)) {
                    return true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean validaInsertUser(String Email, String Senha, String Nome) {
        ConexaoDB conect = new ConexaoDB();
                try {

            ResultSet resultSet = conect.getUsuario();
            while (resultSet.next()) {
                if (resultSet.getString(2).equals(Email) && resultSet.getString(4).equals(Senha)) {
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultSet resultSet = conect.setUsuario(Email, Senha, Nome);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean validaUpdateUser(String Email, String Senha, String Nome) {
        
        ConexaoDB conect = new ConexaoDB();
        
        if (!Email.equals("")) {
            try {
                ResultSet resultSet = conect.setUsuario(Email, Senha, Nome);
                return true;

            } catch (SQLException ex) {
                Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        } else if (!Senha.equals("")) {
            try {
                ResultSet resultSet = conect.setUsuario(Email, Senha, Nome);
                return true;

            } catch (SQLException ex) {
                Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        } else if (!Nome.equals("")) {
            try {
                ResultSet resultSet = conect.setUsuario(Email, Senha, Nome);
                return true;

            } catch (SQLException ex) {
                Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        return false;
    }
}
