-- 1 criar banco de dados
create database db_pizzaria_legal;
-- relacionar db criado
use db_pizzaria_legal;
create table tb_categoria(
id_categoria bigint(20),
categora varchar(20),

primary key (id_categoria)
);

create table tb_pizza(
id_sabor bigint(20),
sabor varchar(20),
preco decimal(5.2),
adicional varchar(20),

foreign key (id_categoria) references tb_categoria (id_categoria),
primary key(id_sabor)) engine = InnoDB
);