use peladasi;

select * from localjogo;

create table usuarios(
user_cod int(4) auto_increment,
user_nome varchar(45) not null,
user_senha varchar(30) not null,
primary key (user_cod)
);

select * from usuarios;

create table bairro(
bai_cod int(4) auto_increment,
bai_nome varchar(45) not null,
primary key (bai_cod)
);


insert into bairro(bai_nome) values ("conquista");

select * from bairro;

select * from peladeiros;

create table peladeiros(
pe_cod int(4) auto_increment,
pe_nome varchar(45) not null,
pe_telefone varchar(30) not null,
pe_rua varchar(30) not null,
pe_longitude varchar(30) not null,
pe_latitude varchar(30) not null,
primary key (pe_cod),
peBai_cod int,
constraint fk_bairro foreign key(peBai_cod) references bairro(bai_cod) 
);


select * from peladeiros;


select * from Jog;


create table agendaPelada(
agenda_cod int(4) auto_increment,
agendaHora varchar(5) not null,
agenda_data date,
primary key (agenda_cod),
agenda_codPeladeiro  int,
constraint fk_peladeiros foreign key(agenda_codPeladeiro) references peladeiros(pe_cod),
agenda_codLocal  int,
constraint fk_localjogo foreign key(agenda_codLocal) references localjogo(codigo)
);

select * from agendaPelada;

create table Time(
cod int(4) auto_increment,
nome varchar(45) not null,
tipo varchar(45) not null,
primary key (cod)
);
