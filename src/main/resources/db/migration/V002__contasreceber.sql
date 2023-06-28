create table contasreceber (
id int not null primary key auto_increment,
data date,
valorconta decimal(12,2),
idcliente int not null
);

alter table contasreceber add constraint
fk_contasreceber_cliente foreign key(idcliente)
references cliente(id);

insert into contasreceber(data, valorconta, idcliente) values ('2023/06/22', '345,65', '1');
insert into contasreceber(data, valorconta, idcliente) values ('2023/06/22', '589,65', '3');
insert into contasreceber(data, valorconta, idcliente) values ('2023/06/22', '892,54', '2');

