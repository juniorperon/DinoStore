
package lojadino;


public class CadastroDinossauro {
    private int id;
    private String nome;
    private String especie;
    private String nascimento;
    private String nacionalidade;
    private String alimentacao;
    private float comprimento;
    private float altura;
    private float peso;

    public CadastroDinossauro(String nome, String especie, String nascimento, String nacionalidade, String alimentacao, float comprimento, float altura, float peso) {
        this.nome = nome;
        this.especie = especie;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
        this.alimentacao = alimentacao;
        this.comprimento = comprimento;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
