drop database quecano;
create database if not exists quecano;
use quecano;

create table sexo(
id int primary key,
descricao varchar(15) not null
);

insert into sexo values(1, "masculino");
insert into sexo values(2, "femenino");
insert into sexo values(3, "não informar");

create table estado_civil(
id int primary key,
descricao varchar(50)
);

insert into estado_civil values(1, "solteiro");
insert into estado_civil values(2, "casado");
insert into estado_civil values(3, "viuvo");

create table cargo(
id int primary key auto_increment,
nome_cargo varchar(45) not null,
salario float not null,
carga_horaria int not null
);

insert into cargo values(null, "encanador", 1800, 170);
insert into cargo values(null, "assistente de encanador", 1212, 120);
insert into cargo values(null, "motorista", 2000, 200);
insert into cargo values(null, "engenheiro", 2100, 120);

create table usuario(
id int primary key auto_increment,
nome varchar(45) not null,
login varchar(20) not null,
senha varchar(20) not null
);

create table prestador_servico(
id int primary key auto_increment,
numero_matricula int,
nome varchar(45) not null,
data_admissao varchar(10) not null,
cpf varchar(11) not null,
rg varchar(20) not null,
pis varchar(20) not null,
sexo_id int references sexo(id),
estado_civil int references estado_civil(id),
numero_filhos int,
endereco varchar(150),
data_nasc varchar(10),
cadastrado_por int references usuario(id),
cargo_id int references cargo(id)
);

create table empresa (
id int primary key auto_increment,
cnpj varchar(14),
telefone varchar(11),
inscricaoEstadual varchar (45),
razaoSocial varchar(100),
endereco varchar (45),
email varchar (45)
);

create table servico_prestado (
id int primary key auto_increment,
quantidade_horas int,
observacoes varchar (100),
descricao_servico varchar (200),
servico_prestado varchar(100) unique,
prestador_servico_id int references prestador_servico(id),
cnpj_id int references cnpj(id)
);