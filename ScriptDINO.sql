create table cadastrofuncionario(
	nome_func varchar(30),
    cpf_func varchar(30),
    nasc_func varchar(30),
    email_func varchar(30),
    telefone_func varchar(30),
    senha_func varchar(30),
    endereco_func varchar(30)

);
create table cadastrocliente (
	nome varchar(30),
    cpf  varchar(30),
    sexo varchar(30),
    endereco varchar(30),
    cidade varchar(30),
    estado varchar(30),
    email varchar(30),
    nascimento varchar(30),
    telefone varchar(30)

);
create table cadastroproduto(
	id_prd int primary key auto_increment,
    nome_prd varchar(30),
    alimentacao varchar(30),
    especie varchar(30),
    tamanho varchar(30),
    valor_prd varchar(30),
    sexo_prd varchar(30),
    qtd_estoque varchar(30)

);