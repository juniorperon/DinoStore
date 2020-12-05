drop table cadastroproduto;
drop table cadastrofuncionario;
drop table venda;
create table cadastrofuncionario(
	nome_func varchar(30),
    cpf_func varchar(30),
    nasc_func varchar(30),
    email_func varchar(30),
    telefone_func varchar(30),
    senha_func varchar(30),
    endereco_func varchar(30),
    cidade_func varchar(30),
    sexo_func varchar(30),
    estado_func varchar(30)

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
    valor_prd decimal(6,2),
    sexo_prd varchar(30)

);

create table venda(
	id_venda int primary key auto_increment,
	nome_cliente varchar(30),
    nome_prd varchar(30),
    valor_prd decimal(6,2),
    pagamento varchar(30),
    data_atual varchar(30)

);