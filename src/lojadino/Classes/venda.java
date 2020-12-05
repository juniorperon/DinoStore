/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadino.Classes;


public class venda {
    String nome_cliente ="";
    String valor_prd = "";
    String nome_prd = "";
    String data_venda = "";
    String pagamento = "";

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getValor_prd() {
        return valor_prd;
    }

    public void setValor_prd(String valor_prd) {
        this.valor_prd = valor_prd;
    }

    public String getNome_prd() {
        return nome_prd;
    }

    public void setNome_prd(String nome_prd) {
        this.nome_prd = nome_prd;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }
    
}
