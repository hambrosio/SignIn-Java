/* Create database Clinica */
CREATE DATABASE `clinica`;

/* Select database SignIn */
use clinica;

/* Create table rol */
CREATE TABLE `rol` (
  `idRol` int(1) NOT NULL,
  `nombreRol` varchar(15) NOT NULL,
  PRIMARY KEY (`idRol`)
  )
  ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* Insert data into table rol */
INSERT INTO `rol` VALUES 
(1,'Administrador'),
(2,'Director'),
(3,'Secretaria'),
(4,'Especialista');

/* Create table usuarioSesion */
CREATE TABLE `usuarioSesion` (
  `cedula` int(10) NOT NULL,
  `clave` varchar(45) NOT NULL,
  `estado` int(1) NOT NULL,
  `idRol` int(1) NOT NULL,
  PRIMARY KEY (`cedula`,`idRol`),
  KEY `fk_usuarioSesion_rol1_idx` (`idRol`),
  CONSTRAINT `fk_usuarioSesion_rol1` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* Create data into table UsuarioSesion */
INSERT INTO `usuarioSesion` VALUES (100,"456",1,1),
(32311999,"456",1,3),
(32323500,"123",1,3),
(43580621,"milu",2,2),
(71225700,"123",1,1);

/* Create procedure stored SignIn */
USE `signin`;
DROP procedure IF EXISTS `signin`;

DELIMITER $$
USE `signin`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `signin`(
	IN _cedula INT(10),
    IN _clave VARCHAR(45)
)
BEGIN
	select cedula, clave
    from usuarioSesion
    where cedula = _cedula
    and clave = _clave;
END$$

DELIMITER ;