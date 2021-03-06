create database veterinaria;

use veterinaria;

create table user (
		user_id int auto_increment,
		username varchar(60),
		password varchar(60),
		constraint primary key (user_id)
		);

create table dueno (
		rut int,
		nombre varchar(60),
		telefono int,
		constraint primary key (rut)
		);

create table mascota (
		mascota_id int auto_increment,
		nombre varchar(60),
		sexo char(1),
		fecha_nacimiento date,
		dueno_id int,
		constraint primary key (mascota_id),
		constraint foreign key (dueno_id) references dueno(rut)
		);

create table ficha (
		ficha_id int auto_increment,
		diagnostico TEXT,
		recetario TEXT,
		fecha date,
		mascota_id int,
		constraint primary key (ficha_id),
		constraint foreign key (mascota_id) references mascota(mascota_id)
		);

insert into user (username, password) values 
		('ignacio', '1234'), ('mario', '1234'), ('felipe', '1234');
