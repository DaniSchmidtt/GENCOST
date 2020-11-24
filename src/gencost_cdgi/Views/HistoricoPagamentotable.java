/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Views;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author danil
 */
public class HistoricoPagamentotable {
 
    private final SimpleStringProperty usuario;
    private final SimpleDoubleProperty pagamento;
    private final SimpleStringProperty conta;
    private final SimpleStringProperty data;
    
    
    public HistoricoPagamentotable(String usuario, Double pagamento, String conta, String data){
        this.usuario = new SimpleStringProperty(usuario);
        this.pagamento = new SimpleDoubleProperty(pagamento);
        this.conta = new SimpleStringProperty(conta);
        this.data = new SimpleStringProperty(data);
    }
    
    public String getUsuario(){
        return usuario.get();
    }
    
    public SimpleStringProperty usuarioProperty(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario.set(usuario);
    }
    
    public Double getPagamento(){
        return pagamento.get();
    }
    
    public SimpleDoubleProperty pagamentoProperty(){
        return pagamento;
    }
    
    public void setPagamento(Double pagamento){
        this.pagamento.set(pagamento);
    }
    
    public String getconta(){
        return conta.get();
    }
    
    public SimpleStringProperty contaProperty(){
        return conta;
    }
    
    public void setconta(String conta){
        this.conta.set(conta);
    }
    
    public String getData(){
        return data.get();
    }
    
    public SimpleStringProperty dataProperty(){
        return data;
    }
    
    public void setData(String data){
        this.data.set(data);
    }
    
    
}
