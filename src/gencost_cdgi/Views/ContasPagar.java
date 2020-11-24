/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Views;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author danil
 */
public class ContasPagar {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the datamax
     */
    public String getDatamax() {
        return datamax;
    }

    /**
     * @param datamax the datamax to set
     */
    public void setDatamax(String datamax) {
        this.datamax = datamax;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the formapg
     */
    public String getFormapg() {
        return formapg;
    }

    /**
     * @param formapg the formapg to set
     */
    public void setFormapg(String formapg) {
        this.formapg = formapg;
    }

    public static synchronized ContasPagar getInstance() {
        if (instancia == null) {
            instancia = new ContasPagar();
        }
        return instancia;
    }
    private int id;
    private String descricao;
    private String datamax;
    private String grupo;
    private String valor;
    private String formapg;
    private static ContasPagar instancia;

    private ContasPagar() {

    }

    public ContasPagar(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;

    }

    @Override
    public String toString() {
        return descricao;
    }
}
