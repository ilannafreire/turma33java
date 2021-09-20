create database db_RH;
use db_RH;

create table tb_funcionaries(
Id_funcionaries integer primary key auto_increment,
Nome varchar(255),
CPF int(9),
Salario float(8),
Temposerv int(2)
);

insert into tb_funcionaries ( Nome, CPF, Salario, Tempserv) values
("Ilanna", 33333333333, 25.000, 15),
("Eduardo",444444444, 75.000, 25),
("Fabricio",555555555, 3.000, 21),
("Mariana", 666666666, 10.000, 18),
("Karen", 88888888, 23.000, 19); 
select *from tb_funcionaries;
select *from tb_funcionaries where Salario >2000;
select *from tb_funcionaries where Salario <2000;

update tb_Funcionaries set Salario = '4.000' where Id_funcionaries = 3;
select *from tb_funcionaries;



