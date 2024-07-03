CREATE TABLE IF NOT EXISTS person (
    id bigint PRIMARY KEY not null auto_increment,
    first_name varchar(255) ,
    last_name varchar(255)
);
insert into person (first_name, last_name) values ('John', 'Doe');
insert into person (first_name, last_name) values ('Jane', 'Doe');
insert into person (first_name, last_name) values ('Johnny', 'Doe');
