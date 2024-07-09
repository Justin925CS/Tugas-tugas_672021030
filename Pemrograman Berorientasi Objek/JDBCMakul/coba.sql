-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2022 at 04:40 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coba`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `nip` varchar(15) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telepon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`nip`, `nama`, `alamat`, `telepon`) VALUES
('6001', 'Susi Similikiti', 'Jl. Diponegoro 100 Salatiga', '08123456789'),
('6002', 'Bambang Susanto', 'Jl. Merpati 999 Salatiga', '08571234567');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `alamat`) VALUES
('672025001', 'Budi Susanto', 'Jl. Diponegoro 100 Salatiga');

-- --------------------------------------------------------

--
-- Table structure for table `tbmakul`
--

CREATE TABLE `tbmakul` (
  `kodeMakul` varchar(15) NOT NULL,
  `namaMakul` varchar(50) NOT NULL,
  `sks` int(11) NOT NULL,
  `namaDosen` varchar(50) NOT NULL,
  `hari` varchar(15) NOT NULL,
  `jam` varchar(25) NOT NULL,
  `ruang` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbmakul`
--

INSERT INTO `tbmakul` (`kodeMakul`, `namaMakul`, `sks`, `namaDosen`, `hari`, `jam`, `ruang`) VALUES
('TC212G', 'Pemrograman Berorientasi Objek', 3, 'Ramos Somya, S.Kom., M.Cs.', 'Selasa', '10-13', 'FTI464');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tbmakul`
--
ALTER TABLE `tbmakul`
  ADD PRIMARY KEY (`kodeMakul`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
