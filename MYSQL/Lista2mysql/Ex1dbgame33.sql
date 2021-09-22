create database db_game_online33;

use db_game_online33;
create table tb_classes(
	id bigint auto_increment,
    nome varchar(255),
    poder varchar(255),
    defesa int,
    primary key (id) 
);

insert into tb_classes (nome, poder, defesa)  values 
("Ariel", "arco e flecha", "80"),
("Doguxo", "tiro de confete", "40"),
("Cleyton", "raio de café", "70"),
("Vinky", "sopro de algodao doce", "90");
  
create table tb_personagens(
id bigint auto_increment,
fk_id_classes bigint,
nome varchar(20),
genero varchar(20),
raça varchar(20),
ataque int,
vida int,
primary key(id),
foreign key (fk_id_classes) references tb_classes (id)
);
insert into tb_personagens(nome, genero, raça, ataque, vida) 
    values("Xuxa","ellu","bilu",30,110);
    insert into tb_personagens(nome, genero, raça, ataque, vida) 
    values("Augusto","ela","tirex",70,120); 
    insert into tb_personagens(nome, genero, raça, ataque, vida) 
    values("Rosana","ela","repetil",30,195); 
    insert into tb_personagens(nome, genero, raça, ataque, vida) 
    values("Clarice","elle","akita",20,130); 
    insert into tb_personagens(nome, genero, raça, ataque, vida) 
    values("Helena","ellu","medusa",90,145); 
    insert into tb_personagens(nome, genero, raça, ataque, vida) 
    values("Graebin","ele","peace",50,220); 
    insert into tb_personagens(nome, genero, raça, ataque, vida) 
    values("Ilanna","ellu","jacaroa",60,225); 
select *from tb_personagens where ataque > 200;
select *from tb_personagens where atque between 1000 and 2000;
select *from tb_personagens where nome like "%C%";
select *from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.fk_id_classes
where fk_id_classes = 5;
