-- 1 criar banco de dados
create database db_farmacia_do_bem;
-- relacionar db criado
use db_farmacia_do_bem;
create table tb_categoria(
        id bigint auto_increment,
        tipo varchar(20),
        comprimidos int,
        lab varchar(20),
        primary key (id)
);
insert into tb_categoria(tipo,comprimidos, lab)
VALUES
("Alopático", 20, "EMS CORP"),
("Genérico", 30, "MEDLEY"),
("Fitoterápico", 30, "ACHÉ"),
("Homeopático", 10, "BAYER"),
("Referência", 20, "EUROFARMA");

create table tb_produto(
    id bigint auto_increment,
    fk_id_categoria bigint,
    nome varchar (20),
    dose int,
	validade varchar(20), 
    geometria varchar(20),
    preço decimal (2.2),
    primary key (id),
    foreign key (fk_id_categoria) references tb_categoria (id)
);
insert into tb_produto(nome,dose,validade,geometria,preço,fk_id_categoria) 
values 
("Escitalopram",3,"2024-08-11","redondo",50.00,2),
("Dipirona",4,"2027-09-25","cilindro",70.00,4),
("Citalopram",2,"2023-03-12","cilindro",80.00,3),
("Diazepam",1,"2022-03-17","redondo",55.00,4),
("Alprazolam",2,"2029-05-04","cilindro",77.50,1),
("Paracetamol",3,"2030-07-31","redondo",85.30,3),
("Cliclobenzaprina ",5,"2035-02-21","redondo",96.00,5),
("Miosan",1,"2024-03-26","cilindro",60.00,2);

select * from tb_produto where preço > 50;

select * from tb_produto where preço between 3 and 60;

select * from tb_produto where sabor like "%B%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id  = tb_produto.fk_id_categoria;

select * from tb_produto inner join tb_categoria
on tb_categoria.id  = tb_produto.fk_id_categoria
where fk_id_categoria = 2;
