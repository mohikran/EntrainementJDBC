-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mar 13 Juin 2017 à 22:02
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `personne`
--
CREATE DATABASE IF NOT EXISTS `personne` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `personne`;

-- --------------------------------------------------------

--
-- Structure de la table `humains`
--

CREATE TABLE IF NOT EXISTS `humains` (
  `NOM` varchar(10) NOT NULL,
  `PRENOM` varchar(10) NOT NULL,
  `SECU` int(10) NOT NULL,
  PRIMARY KEY (`SECU`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `humains`
--

INSERT INTO `humains` (`NOM`, `PRENOM`, `SECU`) VALUES
('Piccini', 'Alexandre', 6991),
('Jean', 'Dujardin', 117),
('James', 'Bond', 7);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
