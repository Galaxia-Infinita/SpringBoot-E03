CREATE DATABASE ReservaPasteleriaR;

-- drop database ReservaPasteleriaR;
USE ReservaPasteleriaR;

CREATE TABLE usuario(
idusuario INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
nombre VARCHAR(30) NOT NULL,
apellido VARCHAR(30) NOT NULL,
dni VARCHAR(8) UNIQUE NOT NULL,
contraseña VARCHAR(20) NOT NULL,
nomusuario VARCHAR(20) UNIQUE NOT NULL,
est_usu BIT(1) NOT NULL
);

CREATE TABLE producto(
idproducto INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
descripcion VARCHAR(100) NOT NULL,
det_desc VARCHAR(300) NOT NULL,
precio FLOAT NOT NULL,
cantidad INT NOT NULL,
est_produc BIT(1) NOT NULL
);

CREATE TABLE reserva(
idpedido INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
nomres VARCHAR(30) NOT NULL,
aperes VARCHAR(30) NOT NULL,
dnires VARCHAR(8) UNIQUE NOT NULL,
celres VARCHAR(9) NOT NULL,
fechareserva DATE NOT NULL,
fechaentrega DATE NOT NULL,
cantpres INT NOT NULL,
est_res BIT(1) NOT NULL,
idproducto INT NOT NULL,
idusuario INT NOT NULL
);

ALTER TABLE RESERVA ADD FOREIGN KEY (idproducto) references producto (idproducto);
ALTER TABLE RESERVA ADD FOREIGN KEY (idusuario) references usuario (idusuario);
