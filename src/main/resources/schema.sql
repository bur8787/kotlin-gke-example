drop table if exists workers;

create table workers
(
   id integer not null auto_increment,
   name varchar(255) not null,
   primary key(id)
);