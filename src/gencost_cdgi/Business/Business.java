/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Business;

import gencost_cdgi.DAO.ConexaoDB;
import gencost_cdgi.Gencost_CDGI;
import gencost_cdgi.Views.Usuario;
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
            Usuario usuario = null;
            usuario = usuario.getInstance();
            while (resultSet.next()) {
                if (resultSet.getString(2).equals(Email) && resultSet.getString(4).equals(Senha)) {
                    int id = resultSet.getInt(1);
                    String email = resultSet.getString(2).toString();
                    String usr = resultSet.getString(3).toString();
                    String senha = resultSet.getString(4).toString();
                    usuario.setId(id);
                    usuario.setEmail(email);
                    usuario.setNome(usr);
                    usuario.setSenha(senha);
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

    public void UpdateUser(String Email, String Senha, String Nome) throws SQLException {

        try {

            ConexaoDB conect = new ConexaoDB();
            Usuario usuario = null;
            usuario = usuario.getInstance();
            if (!Email.equals("")) {
                usuario.setEmail(Email);
            }
            if (!Senha.equals("")) {
                usuario.setNome(Nome);
            }
            if (!Nome.equals("")) {
                usuario.setSenha(Senha);
            }
            conect.updateUsuario(usuario.getId(), usuario.getEmail(), usuario.getSenha(), usuario.getNome());

        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Criargrupo(String Nome, String Imagem) {
        ConexaoDB conect = new ConexaoDB();
        try {
            ResultSet resultSet = conect.setGrupo(Nome, Imagem);
            Usuario user = null;
            user = user.getInstance();
            resultSet = conect.setGrupoUsuario(user.getId());
        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    public void AdicionarUsrGrupo(int IDusr, int IDgrupo) {
        ConexaoDB conect = new ConexaoDB();
        try {
            ResultSet resultSet = conect.setGrupoUsuario(IDusr,IDgrupo);
        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
