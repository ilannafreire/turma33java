create database db_cursoDaMinhaVida33;
use db_cursoDaMinhaVida33;

create table tb_categoria(
id_categoria int auto_increment,
categoria varchar(25),
tipo varchar(25),
primary key (id_categoria)
);

create table tb_produto(
id_produto int (3) auto_increment,
id_categoria int,
nome varchar(50),
preco decimal(7,2),
duracao_dias int (3),
primary key (id_produto),
foreign key  (id_categoria) references tb_categoria (id_categoria)
);

insert into tb_categoria (categoria,tipo) values
('Proteínas','Bioquímica'),
('Herança','Genética'),
('Fraturas','Traumatologia');

insert into tb_produto (id_categoria,nome,preco,duracao_dias) values
(1,'Introducao a bioquimica',1200,20),
(2,'Herança ligada ao sexo',1990.99,35),
(1,'Ossos e articulações',2300.90,22),
(3,'Lipidios',1400.00,30),
(2,'Emergencias ortopedicas',1799.99,39);


select * from tb_produto where preco>1500;
select * from tb_produto where preco>1500 and preco<2000;
select * from tb_produto where nome like '%j%';

#SELECT INNER JOIN

select * from tb_produto inner join tb_categoria on tb_produto.id_categoria = tb_categoria.id_categoria;

# SELECT CATEGORIA ESPECIFICA

select * from tb_produto where id_categoria = 2;

