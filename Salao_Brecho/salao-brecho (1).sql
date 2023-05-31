-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 31-Maio-2023 às 00:40
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `salao-brecho`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `artigo`
--

CREATE TABLE `artigo` (
  `Id` int(30) NOT NULL,
  `Nome` varchar(40) NOT NULL,
  `Preco` double NOT NULL,
  `Quantidade` int(40) NOT NULL,
  `Id_Cliente` int(30) NOT NULL,
  `Cor` varchar(1000) NOT NULL,
  `Tamanho` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `Nome` varchar(40) NOT NULL,
  `Apelido` varchar(40) NOT NULL,
  `Endereco` varchar(40) NOT NULL,
  `Id` int(30) NOT NULL,
  `Maracao` date NOT NULL,
  `Sexo` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Nome` varchar(40) NOT NULL,
  `Apelido` varchar(40) NOT NULL,
  `Cargo` varchar(40) NOT NULL,
  `Sexo` char(15) NOT NULL,
  `Id` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `Nome` varchar(40) NOT NULL,
  `Marcacao` date NOT NULL,
  `Id` int(30) NOT NULL,
  `Id_Cliente` int(11) NOT NULL,
  `id_Servico` int(40) NOT NULL,
  `preco` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

CREATE TABLE `servico` (
  `Nome` varchar(40) NOT NULL,
  `Preco` double NOT NULL,
  `Marcacao` date NOT NULL,
  `Id` int(30) NOT NULL,
  `Id_Cliente` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `artigo`
--
ALTER TABLE `artigo`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Id_Cliente` (`Id_Cliente`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Id_Cliente` (`Id_Cliente`),
  ADD KEY `id_Servico_2` (`id_Servico`);

--
-- Índices para tabela `servico`
--
ALTER TABLE `servico`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Id_Cliente` (`Id_Cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
