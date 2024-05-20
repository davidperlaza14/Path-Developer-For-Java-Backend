-- Crea una base de datos
CREATE DATABASE curso;
-- Usa la foto 
use curso;

-- Crea una tabla
CREATE TABLE  usuarios (
	id int(11) not null auto_increment,
    nombre varchar(80) not null,
    apellido varchar(80) not null,
    fecha_nacimiento datetime null,
    primary key (id)
);
-- Agraga un usuario 
alter table usuarios add column telefono varchar(45) null;

-- Modifica un usuario 
alter table usuarios modify column telefono varchar(30) null;

-- Insertar usuarios
insert into usuarios (
	nombre, apellido, fecha_nacimiento, telefono)
values ('David', 'Perla', '1999-04-04 10:00:00', '123456789');

-- Mostrar usuarios
select * from usuarios; 

-- Eliminar usuarios
delete from usuarios where id = '1';

-- Actualizar (update) 
update usuarios
set nombre = 'Ivan',
apellido = 'Giron'
where id = '2';

-- operadores logicos
-- AND
select * from usuarios where apellido = 'Giron'
OR nombre = 'Ivan';

-- OR
select * from usuarios where apellido = 'Giron'
OR nombre = 'Ivan';

-- Contar numero de filas COUNT(*)
select count(*) from usuarios where apellido = 'Giron'
OR nombre = 'Ivan';