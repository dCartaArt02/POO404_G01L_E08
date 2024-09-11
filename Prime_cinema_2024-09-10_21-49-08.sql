# ************************************************************
# Antares - SQL Client
# Version 0.7.25
# 
# https://antares-sql.app/
# https://github.com/antares-sql/antares
# 
# Host: 127.0.0.1 (MySQL Community Server - GPL 8.4.2)
# Database: Prime_cinema
# Generation time: 2024-09-10T21:49:23-06:00
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
SET NAMES utf8mb4;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table catalogo
# ------------------------------------------------------------

DROP TABLE IF EXISTS `catalogo`;

CREATE TABLE `catalogo` (
  `id` varchar(22) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `llave` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `valor` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

LOCK TABLES `catalogo` WRITE;
/*!40000 ALTER TABLE `catalogo` DISABLE KEYS */;

INSERT INTO `catalogo` (`id`, `llave`, `valor`, `estado`) VALUES
	("generos", "ter", "Terror", 1),
	("generos", "sus", "Suspenso", 1);

/*!40000 ALTER TABLE `catalogo` ENABLE KEYS */;
UNLOCK TABLES;



# Dump of table funcion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `funcion`;

CREATE TABLE `funcion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idPelicula` int NOT NULL,
  `idSala` int NOT NULL,
  `idPrecio` int NOT NULL,
  `idHorario` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idPrecio` (`idPrecio`),
  KEY `idSala` (`idSala`),
  KEY `idHorario` (`idHorario`),
  KEY `idPelicula` (`idPelicula`),
  CONSTRAINT `funcion_ibfk_2` FOREIGN KEY (`idPrecio`) REFERENCES `precios` (`id`),
  CONSTRAINT `funcion_ibfk_3` FOREIGN KEY (`idSala`) REFERENCES `sala` (`id`),
  CONSTRAINT `funcion_ibfk_4` FOREIGN KEY (`idHorario`) REFERENCES `horario` (`id`),
  CONSTRAINT `funcion_ibfk_5` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of table horario
# ------------------------------------------------------------

DROP TABLE IF EXISTS `horario`;

CREATE TABLE `horario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of table pelicula
# ------------------------------------------------------------

DROP TABLE IF EXISTS `pelicula`;

CREATE TABLE `pelicula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `genero` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `clasificacon` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `formato` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of table precios
# ------------------------------------------------------------

DROP TABLE IF EXISTS `precios`;

CREATE TABLE `precios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` int NOT NULL,
  `Precio` decimal(22,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of table sala
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sala`;

CREATE TABLE `sala` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `idSucursal` int NOT NULL,
  `catidadButacas` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idSucursal` (`idSucursal`),
  CONSTRAINT `sala_ibfk_1` FOREIGN KEY (`idSucursal`) REFERENCES `sucursal` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of table sucursal
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sucursal`;

CREATE TABLE `sucursal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `idEncargado` int NOT NULL,
  `direccion` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `telefono` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idEncargado` (`idEncargado`),
  CONSTRAINT `sucursal_ibfk_1` FOREIGN KEY (`idEncargado`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of table usuario
# ------------------------------------------------------------

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `usuario` varchar(25) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `contrasenia` varchar(250) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `dui` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `direccion` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `correo` varchar(25) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci DEFAULT NULL,
  `telefono` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_spanish_ci NOT NULL,
  `rol` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `dui_unique` (`dui`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of table ventafuncion
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ventafuncion`;

CREATE TABLE `ventafuncion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idFuncion` int NOT NULL,
  `idPrecio` int NOT NULL,
  `numButaca` int NOT NULL,
  `estado` int NOT NULL,
  `idHorario` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idFuncion` (`idFuncion`),
  KEY `idPrecio` (`idPrecio`),
  KEY `idHorario` (`idHorario`),
  CONSTRAINT `ventafuncion_ibfk_1` FOREIGN KEY (`idFuncion`) REFERENCES `funcion` (`id`),
  CONSTRAINT `ventafuncion_ibfk_2` FOREIGN KEY (`idPrecio`) REFERENCES `precios` (`id`),
  CONSTRAINT `ventafuncion_ibfk_3` FOREIGN KEY (`idHorario`) REFERENCES `horario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;





# Dump of views
# ------------------------------------------------------------

# Creating temporary tables to overcome VIEW dependency errors


/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

# Dump completed on 2024-09-10T21:49:23-06:00
