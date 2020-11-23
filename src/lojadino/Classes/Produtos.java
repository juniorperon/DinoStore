package lojadino.Classes;

public class Produtos {
    private String codigo ="";

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private String nome = "";
    private String especie = "";
    private String alimentacao = "";
    private String valor = "";
    private String tamanho = "";
    private String sexo = "";
    private String Qtd_estoque = "";

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getQtd_estoque() {
        return Qtd_estoque;
    }

    public void setQtd_estoque(String Qtd_estoque) {
        this.Qtd_estoque = Qtd_estoque;
    }

    // GET, SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getALimentacao() {
        return alimentacao;
    }

    public void setALimentacao(String Alimentacao) {
        this.alimentacao = Alimentacao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void limpaProduto(){
        Qtd_estoque = "";
        alimentacao = "";
        especie = "";
        nome = "";
        tamanho = "";
        sexo = "";
        valor = "";
        
    }
}
