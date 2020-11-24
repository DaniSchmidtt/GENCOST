/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caiod
 */
public class ConexaoDB {

    String usuario = "ed";
    String senha = "1empresa*";
    String url = "jdbc:sqlserver://srvgen.database.windows.net;databaseName=gencost"
            + ";user=" + usuario + ";password=" + senha + ";";

    public Connection conecta() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conexao = DriverManager.getConnection(url);
            return conexao;
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            e.printStackTrace();

        }
        return null;
    }

    public ResultSet getUsuario() throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String selectSql = "SELECT ID,Email,Nickname,Senha  FROM tbUsuario";
            resultSet = statement.executeQuery(selectSql);
            conecta().close();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;
    }

    public ResultSet setUsuario(String Email, String Senha, String Nome) throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String insertSql = "insert into tbUsuario (Nickname, Senha, Email) values ( '" + Nome + "', '" + Senha + "', '" + Email + "')";
            resultSet = statement.executeQuery(insertSql);
            conecta().close();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;
    }

    public void updateUsuario(int id, String Email, String Senha, String Nome) throws SQLException {
        try {

            Statement statement = conecta().createStatement();
            String updateSql = "update tbUsuario set Nickname = '" + Nome + "', Senha = '" + Senha + "', Email ='" + Email + "' where ID = " + id;
            statement.executeQuery(updateSql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
    }
    //Falta alterar a tabela para colocar a data de pagamento, e criar possivel view para dar selecta nela

    public ResultSet setContasPagar() throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String selectSql = "SELECT *  FROM tbDespesa";
            resultSet = statement.executeQuery(selectSql);
            conecta().close();
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;

    }

    public ResultSet setGrupo(String Nome, String Imagem) throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String insertSql = "insert into tbGrupo (NomeGrupo, Imagem) values ( '" + Nome + "', '" + Imagem + "')";
            resultSet = statement.executeQuery(insertSql);
            conecta().close();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;
    }

    public ResultSet setGrupoUsuario(int Iduser) throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String insertSql = "insert into tbUsuarioGrupo values ( " + Iduser + ", (select top 1 ID from tbGrupo order by ID desc))";
            resultSet = statement.executeQuery(insertSql);
            conecta().close();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;
    }

    public ResultSet setGrupoUsuario(int Iduser, int IdGrupo) throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String insertSql = "insert into tbUsuarioGrupo values ( " + Iduser + "," + IdGrupo + ")";
            resultSet = statement.executeQuery(insertSql);
            conecta().close();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;
    }

    public ResultSet getGrupos(int idusr) throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String selectSql = "SELECT ID,NomeGrupo,(SELECT COUNT(*) FROM tbUsuarioGrupo WHERE IDGrupo = ID)"
                    + " FROM tbGrupo GP INNER JOIN tbUsuarioGrupo UGP ON GP.ID = UGP.IDGrupo WHERE UGP.IDUsuario = " + idusr;
            resultSet = statement.executeQuery(selectSql);
            conecta().close();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;
    }

    public ResultSet getUsuariosGrupos(int grupo) throws SQLException {
        try {
            ResultSet resultSet = null;
            Statement statement = conecta().createStatement();
            String selectSql = "select Nickname,Email from tbUsuario inner join tbUsuarioGrupo on ID = IDUsuario inner join tbGrupo gp on gp.ID = IDGrupo where IDGrupo = "+ grupo;
            resultSet = statement.executeQuery(selectSql);
            conecta().close();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conecta().close();
        return null;
    }
}
