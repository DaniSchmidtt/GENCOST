/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Business;

import gencost_cdgi.DAO.ConexaoDB;
import gencost_cdgi.Gencost_CDGI;
import gencost_cdgi.Views.ContasHistTable;
import gencost_cdgi.Views.ContasPagarTable;
import gencost_cdgi.Views.GrupoTable;
import gencost_cdgi.Views.MembrosTable;
import gencost_cdgi.Views.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    public ArrayList<String> pesquisaUser(String Email) {
        ConexaoDB conect = new ConexaoDB();
        try {

            ResultSet resultSet = conect.getUsuario();
            while (resultSet.next()) {
                if (resultSet.getString(2).equals(Email)) {
                    String id = Integer.toString(resultSet.getInt(1));
                    String email = resultSet.getString(2);
                    String nome = resultSet.getString(3);
                    ArrayList<String> retorno = new ArrayList<String>();
                    retorno.add(id);
                    retorno.add(email);
                    retorno.add(nome);
                    return retorno;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<String>() {
        };
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
    }

    public void AdicionarUsrGrupo(int IDusr, int IDgrupo) {
        ConexaoDB conect = new ConexaoDB();
        try {
            ResultSet resultSet = conect.setGrupoUsuario(IDusr, IDgrupo);
        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<GrupoTable> Selecionagrupos() {
        ConexaoDB conect = new ConexaoDB();
        try {
            Usuario user = null;
            user = user.getInstance();
            ArrayList<GrupoTable> retorno = new ArrayList<GrupoTable>();
            ResultSet resultSet = conect.getGrupos(user.getId());
            while (resultSet.next()) {
                retorno.add(new GrupoTable(resultSet.getString(3), resultSet.getString(2), resultSet.getInt(1)));
            }
            return retorno;
        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<MembrosTable> SelecionaUsuariosGrupo(int idgrupo) {
        ConexaoDB conect = new ConexaoDB();
        try {
            Usuario user = null;
            user = user.getInstance();
            ArrayList<MembrosTable> retorno = new ArrayList<MembrosTable>();
            ResultSet resultSet = conect.getUsuariosGrupos(idgrupo);
            while (resultSet.next()) {
                retorno.add(new MembrosTable(resultSet.getString(1), resultSet.getString(2)));
            }
            return retorno;
        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<ContasHistTable> SelecionaContasHistoricousr() {
        ConexaoDB conect = new ConexaoDB();
        try {
            Usuario user = null;
            user = user.getInstance();
            ArrayList<ContasHistTable> retorno = new ArrayList<ContasHistTable>();
            ResultSet resultSet = conect.getContasHistorico(user.getId());
            while (resultSet.next()) {             
                retorno.add(new ContasHistTable(resultSet.getString(1), resultSet.getString(2),resultSet.getString(4),resultSet.getString(3)));
            }
            return retorno;
        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        public ArrayList<ContasPagarTable> SelecionaContasAbertas() {
        ConexaoDB conect = new ConexaoDB();
        try {
            Usuario user = null;
            user = user.getInstance();
            ArrayList<ContasPagarTable> retorno = new ArrayList<ContasPagarTable>();
            ResultSet resultSet = conect.getContasaAbertas(user.getId());
            while (resultSet.next()) {             
                retorno.add(new ContasPagarTable(resultSet.getString(1), resultSet.getString(4),resultSet.getString(2),resultSet.getString(3)));
            }
            return retorno;
        } catch (SQLException ex) {
            Logger.getLogger(Gencost_CDGI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
