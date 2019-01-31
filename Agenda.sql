-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.1.21-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para agenda
DROP DATABASE IF EXISTS `agenda`;
CREATE DATABASE IF NOT EXISTS `agenda` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `agenda`;


-- Copiando estrutura para tabela agenda.contatos
DROP TABLE IF EXISTS `contatos`;
CREATE TABLE IF NOT EXISTS `contatos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `USUARIO_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_usuID` (`USUARIO_ID`),
  CONSTRAINT `fk_usuID` FOREIGN KEY (`USUARIO_ID`) REFERENCES `usuario` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela agenda.contatos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `contatos` DISABLE KEYS */;
/*!40000 ALTER TABLE `contatos` ENABLE KEYS */;


-- Copiando estrutura para tabela agenda.itens_contatos
DROP TABLE IF EXISTS `itens_contatos`;
CREATE TABLE IF NOT EXISTS `itens_contatos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `COD_PAIS` varchar(5) NOT NULL,
  `DDD` varchar(5) NOT NULL,
  `TELEFONE` varchar(15) DEFAULT NULL,
  `CELULAR` varchar(15) DEFAULT NULL,
  `CONTATOS_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_contID` (`CONTATOS_ID`),
  CONSTRAINT `fk_contID` FOREIGN KEY (`CONTATOS_ID`) REFERENCES `contatos` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela agenda.itens_contatos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `itens_contatos` DISABLE KEYS */;
/*!40000 ALTER TABLE `itens_contatos` ENABLE KEYS */;


-- Copiando estrutura para tabela agenda.usuario
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USUARIO` varchar(15) NOT NULL,
  `SENHA` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `uk_US` (`USUARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela agenda.usuario: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`ID`, `USUARIO`, `SENHA`) VALUES
	(1, 'eliezer', '123'),
	(2, 'lucas', '123'),
	(3, 'bruna', '123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
