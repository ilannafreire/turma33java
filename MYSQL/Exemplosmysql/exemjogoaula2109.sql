-- cria banco de dados
create database db_jogo_gen33;

-- Selecionar o banco de dados
use db_jogo_gen33;

-- Criar primeira tabela classe
create table tb_classes(
  id bigint auto_increment,
  nome varchar(255),
  poder varchar(255),
  energia int(255),
  primary key (id),
  );
  
  -- Popular dados na tabela 
  insert into tb_classes(nome, poder, energia) 
        values("maga", "bola de fogo", 90); 
  insert into tb_classes(nome, poder, energia) 
        values("arqueira", "chuva de flechas", 100);  
  insert into tb_classes(nome, poder, energia) 
         values("maga", "agua transbordante", 90);  
  insert into tb_classes(nome, poder, energia) 
        values("maga", "sugadoras de almas", 150);  
        
select *from tb_classes;

-- Criar tabela personagens
create table tb_personagens(
id bigint auto_increment,
nome varchar(20),
raça varchar(20),
ataque int,
vida int,
primary key(id),
foreign key(fk_id_classe) references tb_classes(id)
)
-- Inserir/popular dados na tabela.
insert into tb_personagens( nome, genero , raça , ataque, vida , fk_id_classes)
values  ("Gustavo","ele", "Jacaré","20","50",)
insert into tb_personagens( nome, genero , raça , ataque, vida , fk_id_classes)
values  ("Joice","ela", "humana","20","50",)
insert into tb_personagens( nome, genero , raça , ataque, vida , fk_id_classes)
values  ("Gustavo","ele", "Jacaré","20","50",)
insert into tb_personagens( nome, genero , raça , ataque, vida , fk_id_classes)
values  ("Gustavo","ele", "Jacaré","20","50",)

select * from tb_personagens;
-- use um select que retorne os personagens com ataque maior que 10
select *from tb_personagens; where ataque > 10;
-- um select que retorne os personagens com a vida entre 40 e 101
select *from tb_personagens where vida between 40 and 101;
-- Um select utilizando LIKE para buscar os personagens com a letra J
select *from tb_