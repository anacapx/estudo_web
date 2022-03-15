create database ecommerce_ifood;

use ecommerce_ifood;

create table departamento(
	numero integer not null auto_increment primary key, 
	nome   varchar(50) not null, 
	andar  integer
);
  

create table cliente(
	numero      integer not null auto_increment primary key, 
	nome        varchar(100) not null, 
	cpf         varchar(11) not null unique, 
	email       varchar(50) not null unique, 
	telefone    integer not null, 
	logradouro  varchar(50) not null , 
    num_res     integer, 
	compl       varchar(30), 
	bairro      varchar(30), 
	cidade      varchar(30), 
	estado      char(2) not null, 
	cep         char(8)
);
  
create table produto(
	codigo integer not null auto_increment primary key, 
	nome varchar(50) not null, 
	descricao text, 
	preco double, 
	qtd_estoque integer, 
    link_foto varchar(255), 
	num_depto integer not null,
	
	constraint fk_depto foreign key (num_depto) references departamento(numero)
);
    

create table pedido(
	numero integer not null auto_increment primary key, 
	data date, 
	valor_bruto double, 
	desconto double, 
    valor_total double, 
	num_cliente integer not null,
	constraint fk_ped_cliente foreign key (num_cliente) references cliente (numero)
);
    

create table pedido_produto(
	num_seq      integer not null auto_increment primary key, 
	cod_produto  integer not null, 
	num_pedido   integer not null, 
    quantidade   integer, 
	preco_unit   double, 
	preco_total  double,
	constraint fk_prod foreign key (cod_produto) references produto(codigo),
	constraint fk_pedido foreign key (num_pedido) references pedido(numero)
);
    