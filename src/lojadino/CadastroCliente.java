package lojadino;


public class CadastroCliente {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String nascimento;
    private String endereco;
    private String estado;
    private String cidade;
    private String sexo;
    private String senha;

    public CadastroCliente(String nome, String email, String telefone, String nascimento, String endereco, String estado, String cidade, String sexo, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.sexo = sexo;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
